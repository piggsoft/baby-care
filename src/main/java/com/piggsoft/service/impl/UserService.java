package com.piggsoft.service.impl;

import com.piggsoft.model.User;
import com.piggsoft.service.BaseService;

/**
 * Created by piggs on 2016/5/6.
 */
public interface UserService extends BaseService<User> {
    boolean existPhone(String phone);

    void register(User user);

    void login(String phone, String password);
}
