package com.piggsoft.service.impl;

import com.piggsoft.constants.ErrorInfo;
import com.piggsoft.exception.ServiceException;
import com.piggsoft.model.User;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

/**
 * Created by piggs on 2016/5/6.
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> {

    public boolean existPhone(String phone) {
        User user = new User();
        user.setPhone(phone);
        User result = super.selectOne(user);
        if (null != result) {
            return true;
        }
        return false;
    }

    public void register(User user) {
        if (existPhone(user.getPhone())) {
            throw new ServiceException(ErrorInfo.PHONE_HAD_EXISTS);
        }
        user.setPassword(DigestUtils.md5Hex(user.getPassword()));
        super.save(user);
    }
}
