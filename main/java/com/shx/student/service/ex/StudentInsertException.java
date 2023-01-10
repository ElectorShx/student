package com.shx.student.service.ex;

public class StudentInsertException extends ServiceException{
    public StudentInsertException() {
        super();
    }

    public StudentInsertException(String message) {
        super(message);
    }

    public StudentInsertException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentInsertException(Throwable cause) {
        super(cause);
    }

    protected StudentInsertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
