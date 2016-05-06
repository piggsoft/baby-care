package com.piggsoft.exception;

import com.piggsoft.constants.ErrorInfo;

/**
 * Created by piggs on 2016/5/6.
 */
public class ServiceException extends BabyCareException {

    public ServiceException(String code, String msg) {
        super(code, msg);
    }

    public ServiceException(String code, String msg, Throwable cause) {
        super(code, msg, cause);
    }

    public ServiceException(ErrorInfo errorInfo) {
        super(errorInfo);
    }

    public ServiceException(ErrorInfo errorInfo, Throwable cause) {
        super(errorInfo, cause);
    }
}
