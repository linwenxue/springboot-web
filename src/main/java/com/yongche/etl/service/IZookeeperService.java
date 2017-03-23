package com.yongche.etl.service;

import com.yongche.etl.base.IService;
import com.yongche.etl.entity.ZooKeeper;
import com.yongche.etl.util.SysException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wenxuelin on 2017/1/5.
 */
@Service
public interface IZookeeperService extends IService<ZooKeeper> {
    /**
     * 插入
     *
     * @param entity 实体对象
     * @return 实体对象
     * @throws SysException 系统异常
     */
    public ZooKeeper insert(ZooKeeper entity) throws SysException;

    /**
     * 修改
     *
     * @param entity 实体对象
     * @return 更新记录数
     * @throws SysException 系统异常
     */
    public int update(ZooKeeper entity) throws SysException;

    /**
     * 删除
     *
     * @param entity 实体对象
     * @return 删除记录数
     * @throws SysException 系统异常
     */
    public int delete(ZooKeeper entity) throws SysException;

    /**
     * 查询集合
     *
     * @param entity 实体对象
     * @return 实体对象列表
     * @throws SysException 系统异常
     */
    public List<ZooKeeper> queryList(ZooKeeper entity) throws SysException;

    /**
     * 查询对象
     *
     * @param entity 实体对象
     * @return 实体对象
     * @throws SysException 系统异常
     */
    public ZooKeeper queryBean(ZooKeeper entity) throws SysException;

    /**
     * 查询对象
     *
     * @param entity 实体对象
     * @return 实体对象
     * @throws SysException 系统异常
     */
    public int deleteBatch(List<ZooKeeper> entity) throws SysException;
}
