package com.shx.student.service.ex;

public class DepartmentDnoDuplicationException extends ServiceException{
    public DepartmentDnoDuplicationException() {
        super();
    }

    public DepartmentDnoDuplicationException(String message) {
        super(message);
    }

    public DepartmentDnoDuplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public DepartmentDnoDuplicationException(Throwable cause) {
        super(cause);
    }

    protected DepartmentDnoDuplicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
