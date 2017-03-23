package com.yongche.etl.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenxuelin on 2017/1/5.
 */
public class ResponseMessage<T> {
    private ResponesHeader header;
    private List<T> content;

    public ResponseMessage() {
        this.header = new ResponesHeader();
        this.content = new ArrayList<T>();
    }

    public ResponseMessage(String code, String message, List<T> content) {
        this.header = new ResponesHeader(code, message);
        this.content = new ArrayList<T>();
    }

    public void setCode(String code) {
        this.header.setCode(code);
    }

    public void setMessage(String message) {
        this.header.setMessage(message);
    }

    public ResponesHeader getHeader() {
        return header;
    }

    public void setHeader(ResponesHeader header) {
        this.header = header;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public void addContent(T content) {
        this.content.add(content);
    }
}
