package com.piggsoft.model;

import java.util.Date;
import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String phone;

    private String password;

    @Column(name = "create_tm")
    private Date createTm;

    @Column(name = "update_tm")
    private Date updateTm;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return create_tm
     */
    public Date getCreateTm() {
        return createTm;
    }

    /**
     * @param createTm
     */
    public void setCreateTm(Date createTm) {
        this.createTm = createTm;
    }

    /**
     * @return update_tm
     */
    public Date getUpdateTm() {
        return updateTm;
    }

    /**
     * @param updateTm
     */
    public void setUpdateTm(Date updateTm) {
        this.updateTm = updateTm;
    }
}