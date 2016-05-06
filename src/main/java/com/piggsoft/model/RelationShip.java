package com.piggsoft.model;

import javax.persistence.*;

@Table(name = "relation_ship")
public class RelationShip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "baby_id")
    private Integer babyId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "relationship_name")
    private String relationshipName;

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
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return relationship_name
     */
    public String getRelationshipName() {
        return relationshipName;
    }

    /**
     * @param relationshipName
     */
    public void setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName;
    }
}