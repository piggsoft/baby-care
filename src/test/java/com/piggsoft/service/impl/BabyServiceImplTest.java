package com.piggsoft.service.impl;

import com.piggsoft.BootApplication;
import com.piggsoft.model.Baby;
import com.piggsoft.service.BabyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by zxshen2 on 2016/5/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BootApplication.class)
@WebAppConfiguration
public class BabyServiceImplTest {
    @Autowired
    BabyService babyService;

    @Test
    public void testSave() throws Exception {
        Baby o = new Baby();
        o.setName("花娃娃");
        o.setSex("女");
        o.setBirthday(new Date());
        o.setCreateTm(new Date());
        o.setUpdateTm(new Date());
        babyService.save(o);
    }

    @Test
    public void testDelete() throws Exception {

    }

    @Test
    public void testUpdate() throws Exception {

    }

    @Test
    public void testSelectPage() throws Exception {

    }

    @Test
    public void testGetAll() throws Exception {

    }
}