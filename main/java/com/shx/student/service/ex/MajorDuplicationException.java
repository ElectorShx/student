package com.shx.student.service.ex;

public class MajorDuplicationException extends ServiceException{
    public MajorDuplicationException() {
        super();
    }

    public MajorDuplicationException(String message) {
        super(message);
    }

    public MajorDuplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public MajorDuplicationException(Throwable cause) {
        super(cause);
    }

    protected MajorDuplicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
