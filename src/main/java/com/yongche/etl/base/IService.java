package com.yongche.etl.base;

import com.yongche.etl.util.SysException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by wenxuelin on 2017/1/5.
 */
@Service
public interface IService<T> {
    /**
     * 插入
     *
     * @param entity 实体对象
     * @return 实体对象
     * @throws SysException 系统异常
     */
    @Transactional
    public T insert(T entity) throws SysException;

    /**
     * 修改
     *
     * @param entity 实体对象
     * @return 更新记录数
     * @throws SysException 系统异常
     */
    @Transactional
    public int update(T entity) throws SysException;

    /**
     * 删除
     *
     * @param entity 实体对象
     * @return 删除记录数
     * @throws SysException 系统异常
     */
    @Transactional
    public int delete(T entity) throws SysException;

    /**
     * 查询集合
     *
     * @param entity 实体对象
     * @return 实体对象列表
     * @throws SysException 系统异常
     */
    @Transactional
    public List<T> queryList(T entity) throws SysException;

    /**
     * 查询对象
     *
     * @param entity 实体对象
     * @return 实体对象
     * @throws SysException 系统异常
     */
    @Transactional
    public T queryBean(T entity) throws SysException;

    /**
     * 查询对象
     *
     * @param entity 实体对象
     * @return 实体对象
     * @throws SysException 系统异常
     */
    @Transactional
    public int deleteBatch(List<T> entity) throws SysException;
}
