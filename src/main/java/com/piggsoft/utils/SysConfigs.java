package com.piggsoft.utils;

import com.piggsoft.model.Sysconfig;
import com.piggsoft.service.SysConfigService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <br>Created by fire pigg on 2016/5/6.
 *
 * @author piggsoft@163.com
 */
@Component
public class SysConfigs extends ConcurrentHashMap<String, String> implements InitializingBean {

    @Autowired
    private SysConfigService sysConfigService;

    @Override
    public void afterPropertiesSet() throws Exception {
        List<Sysconfig> configs = sysConfigService.getAll();
        if (!CollectionUtils.isEmpty(configs)) {
            configs.forEach(config -> update(config));
        }
    }

    public void update(Sysconfig... configs) {
        if (configs != null && configs.length > 0) {
            List<Sysconfig> configList = Arrays.asList(configs);
            configList.forEach(config -> super.put(config.getSysKey(), config.getSysValue()));
        }
    }

}
