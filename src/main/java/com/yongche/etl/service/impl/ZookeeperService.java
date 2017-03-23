package com.yongche.etl.service.impl;

import com.yongche.etl.base.BaseService;
import com.yongche.etl.dao.IZookeeperDao;
import com.yongche.etl.entity.ZooKeeper;
import com.yongche.etl.service.IZookeeperService;
import com.yongche.etl.util.SysException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by wenxuelin on 2017/1/5.
 */
@Service
public class ZookeeperService extends BaseService implements IZookeeperService {
    @Autowired
    private IZookeeperDao zookeeperDao;

    @Override
    @Transactional
    public ZooKeeper insert(ZooKeeper entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return zookeeperDao.insert(entity);
    }

    @Override
    @Transactional
    public int update(ZooKeeper entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return zookeeperDao.update(entity);
    }

    @Override
    @Transactional
    public int delete(ZooKeeper entity) throws SysException {
        entity.setStatus(STS_HISTORY);
        return zookeeperDao.delete(entity);
    }

    @Override
    @Transactional
    public List<ZooKeeper> queryList(ZooKeeper entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return zookeeperDao.queryList(entity);
    }

    @Override
    @Transactional
    public ZooKeeper queryBean(ZooKeeper entity) throws SysException {
        entity.setStatus(STS_NORMAL);
        return zookeeperDao.queryBean(entity);
    }

    @Override
    @Transactional
    public int deleteBatch(List<ZooKeeper> entity) throws SysException {
        int count = 0;
        for(ZooKeeper zk : entity) {
            zk.setStatus(STS_HISTORY);
            count += zookeeperDao.delete(zk);
        }
        return count;
    }
}
