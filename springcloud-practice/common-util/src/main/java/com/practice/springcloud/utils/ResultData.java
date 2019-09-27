package com.practice.springcloud.utils;

/**
 * @Auther: XF
 * @Date: 2019-09-27 17:46
 * @Description:
 */
public class ResultData {

    private String code;
    private Object data;
    private String msg;

    @Override
    public String toString() {
        return "ResultData{" +
                "code='" + code + '\'' +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
