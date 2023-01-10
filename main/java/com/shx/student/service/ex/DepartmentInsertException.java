package com.shx.student.service.ex;

public class DepartmentInsertException extends ServiceException{
    public DepartmentInsertException() {
        super();
    }

    public DepartmentInsertException(String message) {
        super(message);
    }

    public DepartmentInsertException(String message, Throwable cause) {
        super(message, cause);
    }

    public DepartmentInsertException(Throwable cause) {
        super(cause);
    }

    protected DepartmentInsertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
