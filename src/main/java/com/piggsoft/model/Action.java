package com.piggsoft.model;

import java.util.Date;
import javax.persistence.*;

public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "baby_id")
    private Integer babyId;

    @Column(name = "action_type")
    private String actionType;

    @Column(name = "action_tm")
    private Date actionTm;

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
     * @return baby_id
     */
    public Integer getBabyId() {
        return babyId;
    }

    /**
     * @param babyId
     */
    public void setBabyId(Integer babyId) {
        this.babyId = babyId;
    }

    /**
     * @return action_type
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * @param actionType
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * @return action_tm
     */
    public Date getActionTm() {
        return actionTm;
    }

    /**
     * @param actionTm
     */
    public void setActionTm(Date actionTm) {
        this.actionTm = actionTm;
    }
}