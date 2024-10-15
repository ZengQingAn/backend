package com.gzzsy.backend.core.enums;

import com.gzzsy.backend.core.model.ResultCode;

public enum ErrorCodeEnum implements ResultCode {
    INVALID_PARAM(-1, "invalid param"),
    SYSTEM_BUSY(-2, "system busy, retry later"),
    INVALID_IDENTITY(-3, "invalid identity"),
    SESSION_EXPIRED(-4, "session expired"),
    COMMON_BIZ_ERROR(101, "biz error");

    private final Integer code;
    private final String msg;

    private ErrorCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}