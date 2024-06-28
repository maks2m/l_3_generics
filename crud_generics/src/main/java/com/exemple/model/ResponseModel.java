package com.exemple.model;

import java.time.LocalDateTime;

public class ResponseModel<T> {
    private LocalDateTime createDate;
    private String errorMessage;
    private T data;


}
