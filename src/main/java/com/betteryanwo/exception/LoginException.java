package com.betteryanwo.exception;

/**
 * @author :MaMengna
 * @Date :Create in 14:57 2018/5/29
 */
public class LoginException extends SiyuyuanException {
    public LoginException() {
    }

    public LoginException(String message) {
        super(message);
    }

    public LoginException(String message, Throwable cause) {
        super(message, cause);
    }
}
