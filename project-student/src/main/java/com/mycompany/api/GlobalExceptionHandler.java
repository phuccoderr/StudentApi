package com.mycompany.api;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(ConstraintViolationException.class) //bắt lỗi binding
    @ResponseStatus(HttpStatus.BAD_REQUEST) // phương thức lỗi 500
    @ResponseBody //trả về 1 đối tượng k nên xử lý trả qua trang web
    public ErrorDTO handleGenericException(HttpServletRequest request,Exception exception) {
        ErrorDTO error = new ErrorDTO();

        error.setTimeStamp(new Date());
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.addError(exception.getMessage());
        error.setPath(request.getServletPath());
        return error;
    }


}
