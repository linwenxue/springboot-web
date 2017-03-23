package com.yongche.etl.dao;

import com.yongche.etl.base.IDao;
import com.yongche.etl.entity.TaskConfig;
import com.yongche.etl.util.SysException;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ITaskConfigDao extends IDao<TaskConfig> {
    /**
    * @param entity
    * @return 插入的数据对象
    * @throws SysException
    * @see
    */
    @Override
    public TaskConfig insert(TaskConfig entity) throws SysException;

    /**
    *
    * @param entity
    * @return 修改返回记录
    * @throws SysException
    */
    @Override
    public int update(TaskConfig entity) throws SysException;

    /**
    *
    * @param entity
    * @return 删除记录数
    * @throws SysException
    */
    @Override
    public int delete(TaskConfig entity) throws SysException;

    /**
    *
    * @param entity
    * @return 查询 集合
    * @throws SysException
    */
    @Override
    public List<TaskConfig> queryList(TaskConfig entity) throws SysException;

    /**
    *
    * @param entity
    * @return 查询对象
    * @throws SysException
    */
    @Override
    public TaskConfig queryBean(TaskConfig entity) throws SysException;
}