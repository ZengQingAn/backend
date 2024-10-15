package com.gzzsy.backend.web.config;


import com.gzzsy.backend.core.enums.ErrorCodeEnum;
import com.gzzsy.backend.core.model.BizException;
import com.gzzsy.backend.core.model.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BizException.class)
    public Result<?> bizException(BizException e) {
        return Result.of(e.getCode(), e.getMsg(), null);
    }

    @ExceptionHandler({MissingServletRequestParameterException.class, MethodArgumentNotValidException.class})
    public Result<?> parameterException(Exception e) {
        if (e instanceof MissingServletRequestParameterException) {
            return Result.of(ErrorCodeEnum.INVALID_PARAM.getCode(), e.getMessage(), null);
        } else {
            MethodArgumentNotValidException invalidException = (MethodArgumentNotValidException)e;
            List<ObjectError> allErrors = invalidException.getBindingResult().getAllErrors();
            String msg = allErrors.get(0).getDefaultMessage();
            return Result.of(ErrorCodeEnum.INVALID_PARAM.getCode(), msg, null);
        }
    }

    @ExceptionHandler(Exception.class)
    public Result<?> exception(Exception e) {
        log.error("system error", e);
        return Result.of(
                ErrorCodeEnum.SYSTEM_BUSY.getCode(),
                ErrorCodeEnum.SYSTEM_BUSY.getMsg(),
                null
        );
    }
}
