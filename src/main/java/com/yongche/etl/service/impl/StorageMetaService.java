package com.yongche.etl.service.impl;

import com.yongche.etl.base.BaseService;
import com.yongche.etl.dao.IStorageMetaDao;
import com.yongche.etl.entity.StorageMeta;
import com.yongche.etl.service.IStorageMetaService;
import com.yongche.etl.util.SysException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StorageMetaService extends BaseService implements IStorageMetaService {
    @Autowired
    private IStorageMetaDao storageMetaDao;

    @Override
    @Transactional
    public StorageMeta insert(StorageMeta entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return storageMetaDao.insert(entity);
    }

    @Override
    @Transactional
    public int update(StorageMeta entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return storageMetaDao.update(entity);
    }

    @Override
    @Transactional
    public int delete(StorageMeta entity) throws SysException {
        entity.setStatus(STS_HISTORY);
        return storageMetaDao.delete(entity);
    }

    @Override
    @Transactional
    public List<StorageMeta> queryList(StorageMeta entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return storageMetaDao.queryList(entity);
    }

    @Override
    @Transactional
    public StorageMeta queryBean(StorageMeta entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return storageMetaDao.queryBean(entity);
    }

    @Override
    @Transactional
    public int deleteBatch(List<StorageMeta> entities) throws SysException {
        int count = 0;
        for(StorageMeta e : entities) {
            e.setStatus(STS_HISTORY);
            count += storageMetaDao.delete(e);
        }
        return count;
    }
}