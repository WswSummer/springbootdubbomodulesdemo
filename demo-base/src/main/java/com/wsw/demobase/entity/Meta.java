package com.wsw.demobase.entity;

import java.io.Serializable;

/**
 * @author WSW
 * @date 2020/5/6 16:26
 */
public class Meta implements Serializable {
    private Boolean keepAlive;
    private Boolean requireAuth;

    public Boolean getKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(Boolean keepAlive) {
        this.keepAlive = keepAlive;
    }

    public Boolean getRequireAuth() {
        return requireAuth;
    }

    public void setRequireAuth(Boolean requireAuth) {
        this.requireAuth = requireAuth;
    }
}
