package com.yongche.etl.base;

import com.yongche.etl.util.SysException;

import java.util.List;

/**
 * Created by wenxuelin on 2017/1/5.
 */
public interface IDao<T> {
    /**
     * @param entity
     * @return 插入的数据对象
     * @throws SysException
     * @author wangq
     * @see
     */
    public T insert(T entity) throws SysException;

    /**
     *
     * @param entity
     * @return 修改返回记录
     * @throws SysException
     * @author wangq
     */
    public int update(T entity) throws SysException;

    /**
     *
     * @param entity
     * @return 删除记录数
     * @throws SysException
     * @author wangq
     */
    public int delete(T entity) throws SysException;

    /**
     *
     * @param entity
     * @return 查询 集合
     * @throws SysException
     * @author wangq
     */
    public List<T> queryList(T entity) throws SysException;

    /**
     *
     * @param entity
     * @return 查询对象
     * @throws SysException
     * @author wangq
     */
    public T queryBean(T entity) throws SysException;
}
