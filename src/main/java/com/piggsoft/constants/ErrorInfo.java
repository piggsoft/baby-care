package com.piggsoft.constants;

/**
 * Created by piggs on 2016/5/6.
 */
public class ErrorInfo {

    public static final ErrorInfo PHONE_HAD_EXISTS = create("1001", "该手机号已经注册过");
    public static final ErrorInfo PHONE_OR_PASSWORD_WRONG = create("1002", "手机号或者密码错误");

    private String code;
    private String msg;

    public static ErrorInfo create(String code, String msg) {
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setCode(code);
        errorInfo.setMsg(msg);
        return errorInfo;
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
