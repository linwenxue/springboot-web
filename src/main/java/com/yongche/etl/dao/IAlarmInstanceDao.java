package com.yongche.etl.dao;

import com.yongche.etl.base.IDao;
import com.yongche.etl.entity.AlarmInstance;
import com.yongche.etl.util.SysException;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IAlarmInstanceDao extends IDao<AlarmInstance> {
    /**
    * @param entity
    * @return 插入的数据对象
    * @throws SysException
    * @see
    */
    @Override
    public AlarmInstance insert(AlarmInstance entity) throws SysException;

    /**
    *
    * @param entity
    * @return 修改返回记录
    * @throws SysException
    */
    @Override
    public int update(AlarmInstance entity) throws SysException;

    /**
    *
    * @param entity
    * @return 删除记录数
    * @throws SysException
    */
    @Override
    public int delete(AlarmInstance entity) throws SysException;

    /**
    *
    * @param entity
    * @return 查询 集合
    * @throws SysException
    */
    @Override
    public List<AlarmInstance> queryList(AlarmInstance entity) throws SysException;

    /**
    *
    * @param entity
    * @return 查询对象
    * @throws SysException
    */
    @Override
    public AlarmInstance queryBean(AlarmInstance entity) throws SysException;
}