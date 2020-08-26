package com.wsw.demobase.entity;

import java.io.Serializable;

/**
 * @author WSW
 * @date 2020/5/1 22:06
 */
public class ResponseBean implements Serializable {
    private Integer status;
    private String msg;
    private Object object;

    private ResponseBean() {
    }

    private ResponseBean(Integer status, String msg, Object object) {
        this.status = status;
        this.msg = msg;
        this.object = object;
    }

    public static ResponseBean ok(String msg) {
        return new ResponseBean(200, msg, null);
    }

    public static ResponseBean ok(String msg, Object object) {
        return new ResponseBean(200, msg, object);
    }

    public static ResponseBean error(String msg) {
        return new ResponseBean(500, msg, null);
    }

    public static ResponseBean error(String msg, Object object) {
        return new ResponseBean(500, msg, object);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
