package com.shx.student.service.ex;

public class CludnoDuplicationException extends ServiceException {
    public CludnoDuplicationException() {
        super();
    }

    public CludnoDuplicationException(String message) {
        super(message);
    }

    public CludnoDuplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public CludnoDuplicationException(Throwable cause) {
        super(cause);
    }

    protected CludnoDuplicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
