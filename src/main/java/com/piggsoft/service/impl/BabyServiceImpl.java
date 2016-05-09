package com.piggsoft.service.impl;

import com.piggsoft.model.Baby;
import com.piggsoft.service.BabyService;
import org.springframework.stereotype.Service;

/**
 * Created by zxshen2 on 2016/5/6.
 */
@Service
public class BabyServiceImpl extends BaseServiceImpl<Baby> implements BabyService {

    public Baby getOneById(Integer id) {
        Baby baby = new Baby();
        baby.setId(id);
        return super.selectOne(baby);
    }

}
