package com.yongche.etl.entity;

/**
 * Created by wenxuelin on 2017/1/11.
 */
public class ResponesHeader {
    private String code;
    private String message;

    public ResponesHeader() {}

    public ResponesHeader(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
