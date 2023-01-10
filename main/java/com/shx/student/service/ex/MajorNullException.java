package com.shx.student.service.ex;

public class MajorNullException extends ServiceException{
    public MajorNullException() {
        super();
    }

    public MajorNullException(String message) {
        super(message);
    }

    public MajorNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public MajorNullException(Throwable cause) {
        super(cause);
    }

    protected MajorNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
