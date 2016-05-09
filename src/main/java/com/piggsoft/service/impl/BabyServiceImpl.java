package com.piggsoft.service.impl;

import com.piggsoft.constants.ErrorInfo;
import com.piggsoft.exception.ServiceException;
import com.piggsoft.model.Baby;
import com.piggsoft.model.User;
import com.piggsoft.service.BabyService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

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
