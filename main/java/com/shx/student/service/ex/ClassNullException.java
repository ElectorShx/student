package com.shx.student.service.ex;

public class ClassNullException extends ServiceException{
    public ClassNullException() {
        super();
    }

    public ClassNullException(String message) {
        super(message);
    }

    public ClassNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClassNullException(Throwable cause) {
        super(cause);
    }

    protected ClassNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
