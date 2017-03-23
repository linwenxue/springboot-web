package com.yongche.etl.dao;

import com.yongche.etl.base.IDao;
import com.yongche.etl.entity.Kafka;
import com.yongche.etl.util.SysException;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IKafkaDao extends IDao<Kafka> {
    /**
    * @param entity
    * @return 插入的数据对象
    * @throws SysException
    * @see
    */
    @Override
    public Kafka insert(Kafka entity) throws SysException;

    /**
    *
    * @param entity
    * @return 修改返回记录
    * @throws SysException
    */
    @Override
    public int update(Kafka entity) throws SysException;

    /**
    *
    * @param entity
    * @return 删除记录数
    * @throws SysException
    */
    @Override
    public int delete(Kafka entity) throws SysException;

    /**
    *
    * @param entity
    * @return 查询 集合
    * @throws SysException
    */
    @Override
    public List<Kafka> queryList(Kafka entity) throws SysException;

    /**
    *
    * @param entity
    * @return 查询对象
    * @throws SysException
    */
    @Override
    public Kafka queryBean(Kafka entity) throws SysException;
}