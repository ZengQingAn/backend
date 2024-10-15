package com.gzzsy.backend.core.enums;


import com.gzzsy.backend.core.model.ResultCode;

public enum ServerErrorEnum implements ResultCode {

    ;

    ServerErrorEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private final Integer code;

    private final String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
