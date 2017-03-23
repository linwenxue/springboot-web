package com.yongche.etl.service.impl;

import com.yongche.etl.base.BaseService;
import com.yongche.etl.dao.IAlarmInstanceDao;
import com.yongche.etl.entity.AlarmInstance;
import com.yongche.etl.service.IAlarmInstanceService;
import com.yongche.etl.util.SysException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AlarmInstanceService extends BaseService implements IAlarmInstanceService {
    @Autowired
    private IAlarmInstanceDao alarmInstanceDao;

    @Override
    @Transactional
    public AlarmInstance insert(AlarmInstance entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return alarmInstanceDao.insert(entity);
    }

    @Override
    @Transactional
    public int update(AlarmInstance entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return alarmInstanceDao.update(entity);
    }

    @Override
    @Transactional
    public int delete(AlarmInstance entity) throws SysException {
        entity.setStatus(STS_HISTORY);
        return alarmInstanceDao.delete(entity);
    }

    @Override
    @Transactional
    public List<AlarmInstance> queryList(AlarmInstance entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return alarmInstanceDao.queryList(entity);
    }

    @Override
    @Transactional
    public AlarmInstance queryBean(AlarmInstance entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return alarmInstanceDao.queryBean(entity);
    }

    @Override
    @Transactional
    public int deleteBatch(List<AlarmInstance> entities) throws SysException {
        int count = 0;
        for(AlarmInstance e : entities) {
            e.setStatus(STS_HISTORY);
            count += alarmInstanceDao.delete(e);
        }
        return count;
    }
}