package com.piggsoft.service;

import com.piggsoft.model.User;

/**
 * Created by piggs on 2016/5/6.
 */
public interface UserService extends BaseService<User> {
    boolean existPhone(String phone);

    void register(User user);

    User login(String phone, String password);
}
