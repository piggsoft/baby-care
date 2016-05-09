package com.piggsoft.service.impl;

import com.piggsoft.constants.ErrorInfo;
import com.piggsoft.exception.ServiceException;
import com.piggsoft.model.Baby;
import com.piggsoft.model.RelationShip;
import com.piggsoft.model.User;
import com.piggsoft.service.BabyService;
import com.piggsoft.service.RelationService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by zxshen2 on 2016/5/6.
 */
@Service
public class BabyServiceImpl extends BaseServiceImpl<Baby> implements BabyService {
    @Autowired
    RelationService relationService;

    @Override
    public Baby getOneById(Integer babyId) {
        Baby baby = new Baby();
        baby.setId(babyId);
        return super.selectOne(baby);
    }

    /**
     * 添加宝宝，以及与宝宝的关系
     *
     * @param user_id
     * @param relationship_name
     * @param baby
     * @return
     */
    public int save(Integer user_id, String relationship_name, Baby baby) {
        this.save(baby);
        RelationShip relationShip = new RelationShip();
        relationShip.setRelationshipName(relationship_name);
        relationShip.setBabyId(baby.getId());
        relationShip.setUserId(user_id);
        return relationService.save(relationShip);
    }


}
