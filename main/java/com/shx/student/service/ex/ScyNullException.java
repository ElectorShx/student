package com.shx.student.service.ex;

public class ScyNullException extends ServiceException{
    public ScyNullException() {
        super();
    }

    public ScyNullException(String message) {
        super(message);
    }

    public ScyNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ScyNullException(Throwable cause) {
        super(cause);
    }

    protected ScyNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
