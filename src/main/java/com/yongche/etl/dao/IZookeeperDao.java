package com.yongche.etl.dao;

import com.yongche.etl.base.IDao;
import com.yongche.etl.entity.ZooKeeper;
import com.yongche.etl.util.SysException;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wenxuelin on 2017/1/5.
 */
@Repository
public interface IZookeeperDao extends IDao<ZooKeeper> {
    /**
     * @param entity
     * @return 插入的数据对象
     * @throws SysException
     * @see
     */
    @Override
    public ZooKeeper insert(ZooKeeper entity) throws SysException;

    /**
     *
     * @param entity
     * @return 修改返回记录
     * @throws SysException
     */
    @Override
    public int update(ZooKeeper entity) throws SysException;

    /**
     *
     * @param entity
     * @return 删除记录数
     * @throws SysException
     */
    @Override
    public int delete(ZooKeeper entity) throws SysException;

    /**
     *
     * @param entity
     * @return 查询 集合
     * @throws SysException
     */
    @Override
    public List<ZooKeeper> queryList(ZooKeeper entity) throws SysException;

    /**
     *
     * @param entity
     * @return 查询对象
     * @throws SysException
     */
    @Override
    public ZooKeeper queryBean(ZooKeeper entity) throws SysException;
}
