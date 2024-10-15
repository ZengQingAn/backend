package com.gzzsy.backend.core.model;

import com.gzzsy.backend.core.enums.ErrorCodeEnum;

public class BizException extends RuntimeException {
    private final Integer code;
    private final String msg;

    private BizException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public static BizException of(String msg) {
        return new BizException(ErrorCodeEnum.COMMON_BIZ_ERROR.getCode(), msg);
    }

    public static BizException of(Integer code, String msg) {
        return new BizException(code, msg);
    }

    public static BizException of(ResultCode resultCode) {
        return new BizException(resultCode.getCode(), resultCode.getMsg());
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}
