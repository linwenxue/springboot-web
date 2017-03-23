package com.yongche.etl.service.impl;

import com.yongche.etl.base.BaseService;
import com.yongche.etl.dao.IStorageTableMetaDao;
import com.yongche.etl.entity.StorageTableMeta;
import com.yongche.etl.service.IStorageTableMetaService;
import com.yongche.etl.util.SysException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StorageTableMetaService extends BaseService implements IStorageTableMetaService {
    @Autowired
    private IStorageTableMetaDao storageTableMetaDao;

    @Override
    @Transactional
    public StorageTableMeta insert(StorageTableMeta entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return storageTableMetaDao.insert(entity);
    }

    @Override
    @Transactional
    public int update(StorageTableMeta entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return storageTableMetaDao.update(entity);
    }

    @Override
    @Transactional
    public int delete(StorageTableMeta entity) throws SysException {
        entity.setStatus(STS_HISTORY);
        return storageTableMetaDao.delete(entity);
    }

    @Override
    @Transactional
    public List<StorageTableMeta> queryList(StorageTableMeta entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return storageTableMetaDao.queryList(entity);
    }

    @Override
    @Transactional
    public StorageTableMeta queryBean(StorageTableMeta entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return storageTableMetaDao.queryBean(entity);
    }

    @Override
    @Transactional
    public int deleteBatch(List<StorageTableMeta> entities) throws SysException {
        int count = 0;
        for(StorageTableMeta e : entities) {
            e.setStatus(STS_HISTORY);
            count += storageTableMetaDao.delete(e);
        }
        return count;
    }
}