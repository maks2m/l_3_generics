package com.exemple.model;

import java.time.LocalDateTime;

public class ResponseModel<T> {
    private LocalDateTime createDate;
    private String errorMessage;
    private T data;

    public ResponseModel(T data) {
        this.createDate = LocalDateTime.now();
        this.data = data;
    }

    public ResponseModel(String errorMessage) {
        this.createDate = LocalDateTime.now();
        this.errorMessage = errorMessage;
    }

    public static <T> ResponseModel<T> of(T data) {
        return new ResponseModel<>(data);
    }

    public static ResponseModel<?> ofError(String message) {
        return new ResponseModel<>(message);
    }

    public T getData() {
        return data;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }
}
