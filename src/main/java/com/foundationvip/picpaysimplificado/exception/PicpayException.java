package com.foundationvip.picpaysimplificado.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class PicpayException extends RuntimeException {

    public ProblemDetail toProblemDetail() {
        var problemDetail = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        problemDetail.setTitle("Picpay Internal Server Error");
        return problemDetail;
    }
}
