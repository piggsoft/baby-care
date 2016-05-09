package com.piggsoft.service;

import com.piggsoft.model.Baby;
import com.piggsoft.model.RelationShip;
import com.piggsoft.model.User;

import java.util.List;

/**
 * Created by zxshen2 on 2016/5/6.
 */
public interface RelationService extends BaseService<RelationShip> {
    List<Baby> getBabyByUserId(Integer userId);

    List<User> getUsersByBabyId(Integer babyId);
}
