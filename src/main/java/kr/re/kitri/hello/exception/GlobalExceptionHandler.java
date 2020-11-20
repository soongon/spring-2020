package kr.re.kitri.hello.exception;

import org.postgresql.util.PSQLException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(value = PSQLException.class)
    public String handlePSQLException() {
        return "데이터베이스에 문제가 있어요. 잠시 후 다시 시도해 주세요.";
    }

    @ExceptionHandler(value = IOException.class)
    public String handleIOExcepiton() {
        return "IO예외네요..";
    }

}
