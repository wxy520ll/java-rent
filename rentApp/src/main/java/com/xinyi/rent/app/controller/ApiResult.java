package com.xinyi.rent.app.controller;

/**
 * Created by Administrator on 2016/7/1 0001.
 */
public class ApiResult {
    public final static int SUCCESS = 1;
    public final static int FAIL = 0;
    public final static int CREATE_USER_FAIL = 3;
    /**
     * 是否成功
     */
    private int code = 1;

    /**
     * 失败或成功的提示信息
     */
    private String message;

    /**
     * 返回的数据
     */
    private Object data;

    public ApiResult(){

    }


    public ApiResult(int code, String message) {
        this(code, message, null);
    }

    public ApiResult(Object data) {
        this(SUCCESS, "success", data);
    }

    public ApiResult(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
