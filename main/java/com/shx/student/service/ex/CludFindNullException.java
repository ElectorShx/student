package com.shx.student.service.ex;

public class CludFindNullException extends ServiceException{
    public CludFindNullException() {
        super();
    }

    public CludFindNullException(String message) {
        super(message);
    }

    public CludFindNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public CludFindNullException(Throwable cause) {
        super(cause);
    }

    protected CludFindNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
