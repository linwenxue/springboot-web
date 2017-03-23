package com.yongche.etl.service;

import com.yongche.etl.base.IService;
import com.yongche.etl.entity.AlarmServer;
import com.yongche.etl.util.SysException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface IAlarmServerService extends IService<AlarmServer> {
    /**
     * 插入
     *
     * @param  entity
     * @return 实体对象
     * @throws SysException 系统异常
     */
    public AlarmServer insert(AlarmServer entity) throws SysException;

    /**
     * 修改
     *
     * @param  entity
     * @return 更新记录数
     * @throws SysException 系统异常
     */
    public int update(AlarmServer entity) throws SysException;

    /**
     * 删除
     *
     * @param  entity
     * @return 删除记录数
     * @throws SysException 系统异常
     */
    public int delete(AlarmServer entity) throws SysException;

    /**
     * 查询集合
     *
     * @param entity
     * @return 实体对象列表
     * @throws SysException 系统异常
     */
    public List<AlarmServer> queryList(AlarmServer entity) throws SysException;

    /**
     * 查询对象
     *
     * @param entity
     * @return 实体对象
     * @throws SysException 系统异常
     */
    public AlarmServer queryBean(AlarmServer entity) throws SysException;


    /**
     * 批量删除
     *
     * @param delList 实体对象集合
     * @return 删除记录数
     * @throws SysException 系统异常
     */
    public int deleteBatch(List<AlarmServer> delList) throws SysException;
}