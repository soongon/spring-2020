package kr.re.kitri.hello.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

@Aspect
@Component
public class PerformanceMeasureAspect {
    public static Logger log = LoggerFactory.getLogger(PerformanceMeasureAspect.class);

    @Around("execution(* kr.re.kitri.hello.service.*.*(..))")
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        Instant start = Instant.now();
        Object obj = joinPoint.proceed();
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        long time = timeElapsed.toMillis();
        log.debug(joinPoint.getSignature().getDeclaringTypeName()
                + "." + joinPoint.getSignature().getName()
                + " 함수의 실행시간은 " + time + "밀리세컨드 입니다.");
        return obj;
    }
}
