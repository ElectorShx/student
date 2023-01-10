package com.shx.student.service.ex;

public class ScyDuplicationException extends ServiceException{
    public ScyDuplicationException() {
        super();
    }

    public ScyDuplicationException(String message) {
        super(message);
    }

    public ScyDuplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ScyDuplicationException(Throwable cause) {
        super(cause);
    }

    protected ScyDuplicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
