package com.piggsoft.model;

import javax.persistence.*;

public class Sysconfig {
    @Id
    @Column(name = "sys_key")
    private String sysKey;

    @Column(name = "sys_value")
    private String sysValue;

    /**
     * @return sys_key
     */
    public String getSysKey() {
        return sysKey;
    }

    /**
     * @param sysKey
     */
    public void setSysKey(String sysKey) {
        this.sysKey = sysKey;
    }

    /**
     * @return sys_value
     */
    public String getSysValue() {
        return sysValue;
    }

    /**
     * @param sysValue
     */
    public void setSysValue(String sysValue) {
        this.sysValue = sysValue;
    }
}