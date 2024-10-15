package com.gzzsy.backend.core.model;

import lombok.Data;

@Data
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public static <T> Result<T> success() {
        Result<T> res = new Result<>();
        res.setCode(0);
        res.setMsg("");
        res.setData(null);
        return res;
    }

    public static <T> Result<T> success(T data) {
        Result<T> res = new Result<>();
        res.setCode(0);
        res.setMsg("");
        res.setData(data);
        return res;
    }

    public static <T> Result<T> of(Integer code, String msg, T data) {
        Result<T> res = new Result<>();
        res.setCode(code);
        res.setMsg(msg);
        res.setData(data);
        return res;
    }


}
