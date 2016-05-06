package com.piggsoft.exception;

import com.piggsoft.constants.ErrorInfo;

/**
 * Created by piggs on 2016/5/6.
 */
public class BabyCareException extends RuntimeException {

    private String code;
    private String msg;


    public BabyCareException(String code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public BabyCareException(ErrorInfo errorInfo) {
        super(errorInfo.getMsg());
        this.code = errorInfo.getCode();
        this.msg = errorInfo.getMsg();
    }

    public BabyCareException(String code, String msg, Throwable cause) {
        super(msg, cause);
        this.code = code;
        this.msg = msg;
    }

    public BabyCareException(ErrorInfo errorInfo, Throwable cause) {
        super(errorInfo.getMsg(), cause);
        this.code = errorInfo.getCode();
        this.msg = errorInfo.getMsg();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
