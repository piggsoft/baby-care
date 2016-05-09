package com.piggsoft.service.impl;

import com.piggsoft.DemoApplicationTests;
import com.piggsoft.model.User;
import com.piggsoft.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * <br>Created by fire pigg on 2016/5/9.
 *
 * @author piggsoft@163.com
 */
@Transactional
public class UserServiceTest extends DemoApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        boolean flag = userService.existPhone("13600000000");
        Assert.assertTrue(flag);
    }

    @Test
    @Rollback
    public void testRegister() {
        User user = new User();
        user.setName("haha");
        user.setPhone("13600000001");
        user.setPassword("123456");
        user.setCreateTm(new Date());
        userService.register(user);
    }

}
