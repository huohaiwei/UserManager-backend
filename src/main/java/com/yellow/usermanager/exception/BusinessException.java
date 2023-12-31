package com.yellow.usermanager.exception;

import com.yellow.usermanager.common.ErrorCode;

/**
 * 自定义异常类
 */
public class BusinessException extends RuntimeException{


    /**
     * 状态码
     */
    private final int code;

    /**
     * 描述异常信息
     */
    private final String description;

    public BusinessException(String message, int code, String description) {
        super(message);
        this.code = code;
        this.description = description;

    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMassage());
        this.code = errorCode.getCode();
        this.description = errorCode.getDescription();
    }

    public BusinessException(ErrorCode errorCode,String description) {
        super(errorCode.getMassage());
        this.code = errorCode.getCode();
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
