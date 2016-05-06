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

    public int save(T entity){
        return mapper.insertSelective(entity);
    }

    public int delete(T entity){
        return mapper.deleteByPrimaryKey(entity);
    }

    public int update(T entity) {return mapper.updateByPrimaryKeySelective(entity);}

    /**
     * 单表分页查询
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<T> selectPage(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        //Spring4支持泛型注入
        return mapper.select(null);
    }

    public List<T> getAll() {
        return mapper.selectAll();
    }

    public List<T> selectByExample(Example example) {
        return mapper.selectByExample(example);
    }

    public T selectOne(T t) {
        return mapper.selectOne(t);
    }
}
