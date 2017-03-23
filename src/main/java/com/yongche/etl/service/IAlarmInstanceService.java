package com.yongche.etl.service;

import com.yongche.etl.base.IService;
import com.yongche.etl.entity.AlarmInstance;
import com.yongche.etl.util.SysException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface IAlarmInstanceService extends IService<AlarmInstance> {
    /**
     * 插入
     *
     * @param  entity
     * @return 实体对象
     * @throws SysException 系统异常
     */
    public AlarmInstance insert(AlarmInstance entity) throws SysException;

    /**
     * 修改
     *
     * @param  entity
     * @return 更新记录数
     * @throws SysException 系统异常
     */
    public int update(AlarmInstance entity) throws SysException;

    /**
     * 删除
     *
     * @param  entity
     * @return 删除记录数
     * @throws SysException 系统异常
     */
    public int delete(AlarmInstance entity) throws SysException;

    /**
     * 查询集合
     *
     * @param entity
     * @return 实体对象列表
     * @throws SysException 系统异常
     */
    public List<AlarmInstance> queryList(AlarmInstance entity) throws SysException;

    /**
     * 查询对象
     *
     * @param entity
     * @return 实体对象
     * @throws SysException 系统异常
     */
    public AlarmInstance queryBean(AlarmInstance entity) throws SysException;


    /**
     * 批量删除
     *
     * @param delList 实体对象集合
     * @return 删除记录数
     * @throws SysException 系统异常
     */
    public int deleteBatch(List<AlarmInstance> delList) throws SysException;
}