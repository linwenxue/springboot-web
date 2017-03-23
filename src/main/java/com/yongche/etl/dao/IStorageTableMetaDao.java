package com.yongche.etl.dao;

import com.yongche.etl.base.IDao;
import com.yongche.etl.entity.StorageTableMeta;
import com.yongche.etl.util.SysException;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IStorageTableMetaDao extends IDao<StorageTableMeta> {
    /**
    * @param entity
    * @return 插入的数据对象
    * @throws SysException
    * @see
    */
    @Override
    public StorageTableMeta insert(StorageTableMeta entity) throws SysException;

    /**
    *
    * @param entity
    * @return 修改返回记录
    * @throws SysException
    */
    @Override
    public int update(StorageTableMeta entity) throws SysException;

    /**
    *
    * @param entity
    * @return 删除记录数
    * @throws SysException
    */
    @Override
    public int delete(StorageTableMeta entity) throws SysException;

    /**
    *
    * @param entity
    * @return 查询 集合
    * @throws SysException
    */
    @Override
    public List<StorageTableMeta> queryList(StorageTableMeta entity) throws SysException;

    /**
    *
    * @param entity
    * @return 查询对象
    * @throws SysException
    */
    @Override
    public StorageTableMeta queryBean(StorageTableMeta entity) throws SysException;
}