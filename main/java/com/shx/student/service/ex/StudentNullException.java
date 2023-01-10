package com.shx.student.service.ex;

public class StudentNullException extends ServiceException{
    public StudentNullException() {
        super();
    }

    public StudentNullException(String message) {
        super(message);
    }

    public StudentNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNullException(Throwable cause) {
        super(cause);
    }

    protected StudentNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
