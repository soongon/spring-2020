package kr.re.kitri.hello.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    public Logger log = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* kr.re.kitri.hello.controller.*.*(..))")
    public void loggingAdvice(JoinPoint joinPoint) {
        log.debug(joinPoint.getSignature().getDeclaringTypeName()
                + "." + joinPoint.getSignature().getName()
                + " 함수에서 LoggingAdvice 로그를 남깁니다. ");
    }
}
