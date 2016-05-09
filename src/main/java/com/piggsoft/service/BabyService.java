package com.piggsoft.service;

import com.piggsoft.model.Baby;

/**
 * Created by zxshen2 on 2016/5/6.
 */
public interface BabyService extends BaseService<Baby> {
    public Baby getOneById(Integer id);
}
