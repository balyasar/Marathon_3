package com.yasar.marathon_3.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public ResponseEntity<ErrorMessage> handlerRuntimeException(RuntimeException e) {
        ErrorType errorType = ErrorType.INTERNAL_SERVER_ERROR;
        return new ResponseEntity<>(createMessage(errorType, e), errorType.getHttpStatus());
    }

    /**
     * ExceptionHandler -> Kendisine verilen Exception sınıfını dinlemeye başlar ve
     * eğer ilgili sınıf hata fırlatırsa onu yakalar.
     */

    @ExceptionHandler(SatisException.class)
    @ResponseBody
    public ResponseEntity<ErrorMessage> handlerSatisException(SatisException satisException) {
        return new ResponseEntity<>(createMessage(satisException.getErrorType(), satisException), satisException.getErrorType().getHttpStatus());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ResponseEntity<ErrorMessage> handlerMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        List<String> fields = new ArrayList<>();
        e.getBindingResult().getFieldErrors().forEach(x -> fields.add(x.getField() + " : " + x.getDefaultMessage()));
        ErrorMessage errorMessage = ErrorMessage.builder()
                .code(999)
                .message("Girilen bilgiler eksik ya da yanlıştır.")
                .fields(fields)
                .build();
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }

    private ErrorMessage createMessage(ErrorType errorType, Exception exception) {
        log.error("Tum hatalarin gectigi ortak nokta : " + exception);
        return ErrorMessage.builder()
                .code(errorType.getCode())
                .message(errorType.getMessage())
                .build();
    }

}
