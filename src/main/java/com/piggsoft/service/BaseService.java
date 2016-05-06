package com.piggsoft.service;

import java.util.List;

/**
 * <br>Created by fire pigg on 2016/4/20.
 *
 * @author piggsoft@163.com
 */
public interface BaseService<T> {

    public int save(T entity);

    public int delete(T entity);

    /**
     * 单表分页查询
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<T> selectPage(int pageNum, int pageSize);

    public int update(T entity);

    public List<T> getAll() ;

}
