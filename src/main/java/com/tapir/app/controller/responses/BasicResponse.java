package com.tapir.app.controller.responses;

import com.tapir.app.jpa.model.Tapir;

import java.util.List;

public class BasicResponse {

    private int code;
    private String message;
    private List<Tapir> tapirs;

    public List<Tapir> getTapirs() {
        return tapirs;
    }

    public void setTapirs(List<Tapir> tapirs) {
        this.tapirs = tapirs;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
