package com.exemple.model;

import lombok.ToString;

import java.time.LocalDateTime;

@ToString
public class ResponseModel<T> {

    private LocalDateTime createDate;
    private String errorCode;
    private String errorMessage;
    private T data;

    private ResponseModel(T data) {
        this.createDate = LocalDateTime.now();
        this.data = data;
    }

    private ResponseModel(String errorCode, String errorMessage) {
        this.createDate = LocalDateTime.now();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public static <T> ResponseModel<T> of(T data) {
        return new ResponseModel<>(data);
    }

    public static <T> ResponseModel<T> ofError(String errorCode, String errorMessage) {
        return new ResponseModel<>(errorCode, errorMessage);
    }

    public T getData() {
        return data;
    }
}
