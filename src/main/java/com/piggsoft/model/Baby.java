package com.piggsoft.model;

import java.util.Date;
import javax.persistence.*;

public class Baby {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Date birthday;

    private String sex;

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
     * @return birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
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