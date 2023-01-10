package com.shx.student.service.ex;

public class CludInsertException extends ServiceException{
    public CludInsertException() {
        super();
    }

    public CludInsertException(String message) {
        super(message);
    }

    public CludInsertException(String message, Throwable cause) {
        super(message, cause);
    }

    public CludInsertException(Throwable cause) {
        super(cause);
    }

    protected CludInsertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
