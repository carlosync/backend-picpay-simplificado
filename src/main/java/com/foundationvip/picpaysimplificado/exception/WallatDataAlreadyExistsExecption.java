package com.foundationvip.picpaysimplificado.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class WallatDataAlreadyExistsExecption extends PicpayException{

    private String datail;

    public WallatDataAlreadyExistsExecption(String datail) {
        this.datail = datail;
    }

    @Override
    public ProblemDetail toProblemDetail() {
        var problem = ProblemDetail.forStatus(HttpStatus.UNPROCESSABLE_ENTITY);
        problem.setTitle("Wallat Data Already Exists");
        problem.setDetail(datail);
        return problem;
    }
}
