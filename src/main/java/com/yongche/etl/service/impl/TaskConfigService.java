package com.yongche.etl.service.impl;

import com.yongche.etl.base.BaseService;
import com.yongche.etl.dao.ITaskConfigDao;
import com.yongche.etl.entity.TaskConfig;
import com.yongche.etl.service.ITaskConfigService;
import com.yongche.etl.util.SysException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskConfigService extends BaseService implements ITaskConfigService {
    @Autowired
    private ITaskConfigDao taskConfigDao;

    @Override
    @Transactional
    public TaskConfig insert(TaskConfig entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return taskConfigDao.insert(entity);
    }

    @Override
    @Transactional
    public int update(TaskConfig entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return taskConfigDao.update(entity);
    }

    @Override
    @Transactional
    public int delete(TaskConfig entity) throws SysException {
        entity.setStatus(STS_HISTORY);
        return taskConfigDao.delete(entity);
    }

    @Override
    @Transactional
    public List<TaskConfig> queryList(TaskConfig entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return taskConfigDao.queryList(entity);
    }

    @Override
    @Transactional
    public TaskConfig queryBean(TaskConfig entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return taskConfigDao.queryBean(entity);
    }

    @Override
    @Transactional
    public int deleteBatch(List<TaskConfig> entities) throws SysException {
        int count = 0;
        for(TaskConfig e : entities) {
            e.setStatus(STS_HISTORY);
            count += taskConfigDao.delete(e);
        }
        return count;
    }
}