package com.piggsoft.service.impl;

import com.piggsoft.model.Sysconfig;
import com.piggsoft.service.SysConfigService;
import com.piggsoft.utils.SysConfigs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <br>Created by fire pigg on 2016/5/6.
 *
 * @author piggsoft@163.com
 */
@Service
public class SysConfigServiceImpl extends BaseServiceImpl<Sysconfig> implements SysConfigService {

    @Autowired
    private SysConfigs sysConfigs;

    @Override
    public int update(Sysconfig entity) {
        sysConfigs.update(entity);
        return super.update(entity);
    }

    @Override
    public int save(Sysconfig entity) {
        sysConfigs.update(entity);
        return super.save(entity);
    }
}
