package com.piggsoft.service.impl;

import com.piggsoft.constants.ErrorInfo;
import com.piggsoft.exception.ServiceException;
import com.piggsoft.model.User;
import com.piggsoft.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

/**
 * Created by piggs on 2016/5/6.
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    /**
     * 检查该手机号是否已经存在
     * @param phone 需要检查的手机号
     * @return true-存在；false-不存在
     */
    @Override
    public boolean existPhone(String phone) {
        User user = new User();
        user.setPhone(phone);
        User result = super.selectOne(user);
        if (null != result) {
            return true;
        }
        return false;
    }

    /**
     * 用户注册
     * @param user 通过手机号注册
     */
    @Override
    public void register(User user) {
        if (existPhone(user.getPhone())) {
            throw new ServiceException(ErrorInfo.PHONE_HAD_EXISTS);
        }
        //对密码进行md5加密
        user.setPassword(DigestUtils.md5Hex(user.getPassword()));
        super.save(user);
    }

    @Override
    public void login(String phone, String password) {
        User user = new User();
        user.setPhone(phone);
        user.setPassword(DigestUtils.md5Hex(password));
        User queryResult = super.selectOne(user);
        if (queryResult == null) {//根据phone和密码未找到该用户信息
            throw new ServiceException(ErrorInfo.PHONE_OR_PASSWORD_WRONG);
        }
    }
}
