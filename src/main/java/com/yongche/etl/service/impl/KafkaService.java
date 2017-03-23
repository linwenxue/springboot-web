package com.yongche.etl.service.impl;

import com.yongche.etl.base.BaseService;
import com.yongche.etl.dao.IKafkaDao;
import com.yongche.etl.entity.Kafka;
import com.yongche.etl.service.IKafkaService;
import com.yongche.etl.util.SysException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class KafkaService extends BaseService implements IKafkaService {
    @Autowired
    private IKafkaDao kafkaDao;

    @Override
    @Transactional
    public Kafka insert(Kafka entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return kafkaDao.insert(entity);
    }

    @Override
    @Transactional
    public int update(Kafka entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return kafkaDao.update(entity);
    }

    @Override
    @Transactional
    public int delete(Kafka entity) throws SysException {
        entity.setStatus(STS_HISTORY);
        return kafkaDao.delete(entity);
    }

    @Override
    @Transactional
    public List<Kafka> queryList(Kafka entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return kafkaDao.queryList(entity);
    }

    @Override
    @Transactional
    public Kafka queryBean(Kafka entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return kafkaDao.queryBean(entity);
    }

    @Override
    @Transactional
    public int deleteBatch(List<Kafka> entities) throws SysException {
        int count = 0;
        for(Kafka e : entities) {
            e.setStatus(STS_HISTORY);
            count += kafkaDao.delete(e);
        }
        return count;
    }
}