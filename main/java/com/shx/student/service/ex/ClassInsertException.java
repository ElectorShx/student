package com.shx.student.service.ex;

public class ClassInsertException extends ServiceException{
    public ClassInsertException() {
        super();
    }

    public ClassInsertException(String message) {
        super(message);
    }

    public ClassInsertException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClassInsertException(Throwable cause) {
        super(cause);
    }

    protected ClassInsertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
