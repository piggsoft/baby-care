package com.piggsoft.service.impl;

import com.piggsoft.model.Baby;
import com.piggsoft.model.RelationShip;
import com.piggsoft.model.User;
import com.piggsoft.service.BabyService;
import com.piggsoft.service.RelationService;
import com.piggsoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by zxshen2 on 2016/5/6.
 */
@Service
public class RelationServiceImpl extends BaseServiceImpl<RelationShip> implements RelationService {

    @Autowired
    BabyService babyService;
    @Autowired
    UserService userService;

    @Override
    public List<Baby> getBabyByUserId(Integer userId) {
        RelationShip relationShip = new RelationShip();
        relationShip.setUserId(userId);
        relationShip = this.selectOne(relationShip);
        Example example = new Example(Baby.class);
        example.createCriteria().andEqualTo("user_id", relationShip.getUserId());
        return babyService.selectByExample(example);
    }

    @Override
    public List<User> getUsersByBabyId(Integer babyId) {
        RelationShip relationShip = new RelationShip();
        relationShip.setBabyId(babyId);
        relationShip = this.selectOne(relationShip);
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("baby_id", relationShip.getBabyId());
        return userService.selectByExample(example);
    }

}
