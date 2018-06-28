package com.betteryanwo.exception;

/**
 * 思语缘贸易通用异常类
 * <p>
 * Created by 辉太狼 on 2018/5/28
 */
public class SiyuyuanException extends RuntimeException {
    public SiyuyuanException() {
    }

    public SiyuyuanException(String message) {
        super(message);
    }

    public SiyuyuanException(String message, Throwable cause) {
        super(message, cause);
    }
}
