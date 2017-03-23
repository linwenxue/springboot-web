package com.yongche.etl.service;

import com.yongche.etl.base.IService;
import com.yongche.etl.entity.StorageMeta;
import com.yongche.etl.util.SysException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface IStorageMetaService extends IService<StorageMeta> {
    /**
     * 插入
     *
     * @param  entity
     * @return 实体对象
     * @throws SysException 系统异常
     */
    public StorageMeta insert(StorageMeta entity) throws SysException;

    /**
     * 修改
     *
     * @param  entity
     * @return 更新记录数
     * @throws SysException 系统异常
     */
    public int update(StorageMeta entity) throws SysException;

    /**
     * 删除
     *
     * @param  entity
     * @return 删除记录数
     * @throws SysException 系统异常
     */
    public int delete(StorageMeta entity) throws SysException;

    /**
     * 查询集合
     *
     * @param entity
     * @return 实体对象列表
     * @throws SysException 系统异常
     */
    public List<StorageMeta> queryList(StorageMeta entity) throws SysException;

    /**
     * 查询对象
     *
     * @param entity
     * @return 实体对象
     * @throws SysException 系统异常
     */
    public StorageMeta queryBean(StorageMeta entity) throws SysException;


    /**
     * 批量删除
     *
     * @param delList 实体对象集合
     * @return 删除记录数
     * @throws SysException 系统异常
     */
    public int deleteBatch(List<StorageMeta> delList) throws SysException;
}