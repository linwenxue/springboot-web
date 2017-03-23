package com.yongche.etl.service.impl;

import com.yongche.etl.base.BaseService;
import com.yongche.etl.dao.IAlarmServerDao;
import com.yongche.etl.entity.AlarmServer;
import com.yongche.etl.service.IAlarmServerService;
import com.yongche.etl.util.SysException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AlarmServerService extends BaseService implements IAlarmServerService {
    @Autowired
    private IAlarmServerDao alarmServerDao;

    @Override
    @Transactional
    public AlarmServer insert(AlarmServer entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return alarmServerDao.insert(entity);
    }

    @Override
    @Transactional
    public int update(AlarmServer entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return alarmServerDao.update(entity);
    }

    @Override
    @Transactional
    public int delete(AlarmServer entity) throws SysException {
        entity.setStatus(STS_HISTORY);
        return alarmServerDao.delete(entity);
    }

    @Override
    @Transactional
    public List<AlarmServer> queryList(AlarmServer entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return alarmServerDao.queryList(entity);
    }

    @Override
    @Transactional
    public AlarmServer queryBean(AlarmServer entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return alarmServerDao.queryBean(entity);
    }

    @Override
    @Transactional
    public int deleteBatch(List<AlarmServer> entities) throws SysException {
        int count = 0;
        for(AlarmServer e : entities) {
            e.setStatus(STS_HISTORY);
            count += alarmServerDao.delete(e);
        }
        return count;
    }
}