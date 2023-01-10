package com.shx.student.service.ex;

public class DepartmentFindNullException extends ServiceException{
    public DepartmentFindNullException() {
        super();
    }

    public DepartmentFindNullException(String message) {
        super(message);
    }

    public DepartmentFindNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public DepartmentFindNullException(Throwable cause) {
        super(cause);
    }

    protected DepartmentFindNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
