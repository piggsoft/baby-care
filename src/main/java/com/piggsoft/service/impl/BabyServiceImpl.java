package com.piggsoft.service.impl;

import com.piggsoft.model.Baby;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zxshen2 on 2016/5/6.
 */
@Service
public class BabyServiceImpl extends BaseServiceImpl<Baby> implements com.piggsoft.service.BabyService {
    @Autowired
    private Baby baby;

    @Override
    public int update(Baby entity) {
        int i = super.update(entity);
        return i;
    }

    @Override
    public int save(Baby entity) {
        int i = super.save(entity);
        return i;
    }
}
