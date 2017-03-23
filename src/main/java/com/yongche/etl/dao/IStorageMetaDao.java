package com.yongche.etl.dao;

import com.yongche.etl.base.IDao;
import com.yongche.etl.entity.StorageMeta;
import com.yongche.etl.util.SysException;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IStorageMetaDao extends IDao<StorageMeta> {
    /**
    * @param entity
    * @return 插入的数据对象
    * @throws SysException
    * @see
    */
    @Override
    public StorageMeta insert(StorageMeta entity) throws SysException;

    /**
    *
    * @param entity
    * @return 修改返回记录
    * @throws SysException
    */
    @Override
    public int update(StorageMeta entity) throws SysException;

    /**
    *
    * @param entity
    * @return 删除记录数
    * @throws SysException
    */
    @Override
    public int delete(StorageMeta entity) throws SysException;

    /**
    *
    * @param entity
    * @return 查询 集合
    * @throws SysException
    */
    @Override
    public List<StorageMeta> queryList(StorageMeta entity) throws SysException;

    /**
    *
    * @param entity
    * @return 查询对象
    * @throws SysException
    */
    @Override
    public StorageMeta queryBean(StorageMeta entity) throws SysException;
}