package com.foundationvip.picpaysimplificado.controller;

import com.foundationvip.picpaysimplificado.exception.PicpayException;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(PicpayException.class)
    public ProblemDetail handlePicpayException(PicpayException e) {
        return e.toProblemDetail();
    }
}
