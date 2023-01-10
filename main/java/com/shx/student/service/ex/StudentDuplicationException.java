package com.shx.student.service.ex;

public class StudentDuplicationException extends ServiceException{
    public StudentDuplicationException() {
        super();
    }

    public StudentDuplicationException(String message) {
        super(message);
    }

    public StudentDuplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentDuplicationException(Throwable cause) {
        super(cause);
    }

    protected StudentDuplicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
