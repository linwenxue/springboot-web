package com.yongche.etl.service;

import com.yongche.etl.base.IService;
import com.yongche.etl.entity.StorageTableMeta;
import com.yongche.etl.util.SysException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface IStorageTableMetaService extends IService<StorageTableMeta> {
    /**
     * 插入
     *
     * @param  entity
     * @return 实体对象
     * @throws SysException 系统异常
     */
    public StorageTableMeta insert(StorageTableMeta entity) throws SysException;

    /**
     * 修改
     *
     * @param  entity
     * @return 更新记录数
     * @throws SysException 系统异常
     */
    public int update(StorageTableMeta entity) throws SysException;

    /**
     * 删除
     *
     * @param  entity
     * @return 删除记录数
     * @throws SysException 系统异常
     */
    public int delete(StorageTableMeta entity) throws SysException;

    /**
     * 查询集合
     *
     * @param entity
     * @return 实体对象列表
     * @throws SysException 系统异常
     */
    public List<StorageTableMeta> queryList(StorageTableMeta entity) throws SysException;

    /**
     * 查询对象
     *
     * @param entity
     * @return 实体对象
     * @throws SysException 系统异常
     */
    public StorageTableMeta queryBean(StorageTableMeta entity) throws SysException;


    /**
     * 批量删除
     *
     * @param delList 实体对象集合
     * @return 删除记录数
     * @throws SysException 系统异常
     */
    public int deleteBatch(List<StorageTableMeta> delList) throws SysException;
}