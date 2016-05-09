package com.piggsoft.service.impl;

import com.github.pagehelper.PageHelper;
import com.piggsoft.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * <br>Created by fire pigg on 2016/4/13.
 *
 * @author piggsoft@163.com
 */
@Service
public abstract class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    protected Mapper<T> mapper;

    @Override
    public int save(T entity){
        return mapper.insertSelective(entity);
    }
    @Override
    public int delete(T entity){
        return mapper.deleteByPrimaryKey(entity);
    }
    @Override
    public int update(T entity) {return mapper.updateByPrimaryKeySelective(entity);}

    /**
     * 单表分页查询
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public List<T> selectPage(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        //Spring4支持泛型注入
        return mapper.select(null);
    }
    @Override
    public List<T> getAll() {
        return mapper.selectAll();
    }
    @Override
    public List<T> selectByExample(Example example) {
        return mapper.selectByExample(example);
    }
    @Override
    public T selectOne(T t) {
        return mapper.selectOne(t);
    }
}
