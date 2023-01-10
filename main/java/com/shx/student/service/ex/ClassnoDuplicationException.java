package com.shx.student.service.ex;

public class ClassnoDuplicationException extends ServiceException{
    public ClassnoDuplicationException() {
        super();
    }

    public ClassnoDuplicationException(String message) {
        super(message);
    }

    public ClassnoDuplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClassnoDuplicationException(Throwable cause) {
        super(cause);
    }

    protected ClassnoDuplicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
