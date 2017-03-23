package com.yongche.etl.dao.impl;

import com.yongche.etl.base.BaseDao;
import com.yongche.etl.dao.IZookeeperDao;
import com.yongche.etl.entity.ZooKeeper;
import com.yongche.etl.util.SysException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenxuelin on 2017/1/5.
 */
@Repository
public class ZookeeperDao extends BaseDao implements IZookeeperDao {
    private Logger logger =  LoggerFactory.getLogger(ZookeeperDao.class);

    @Override
    public ZooKeeper insert(final ZooKeeper entity) throws SysException {
        final StringBuilder sql = new StringBuilder();
        sql.append("insert into zookeeper (id, name, host, create_time, update_time, status, creater, updater, remark) ");
        sql.append("values (?,?,?,str_to_date(?,'%Y-%m-%d %H:%i:%s'),str_to_date(?,'%Y-%m-%d %H:%i:%s'),?,?,?,?)");
        try {
            KeyHolder keyHolder = new GeneratedKeyHolder();
            jdbcTemplate.update(
                new PreparedStatementCreator(){
                    public java.sql.PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
                        int i = 0;
                        PreparedStatement ps = conn.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);
                        ps.setString(++i, StringUtils.trimToNull(entity.getId()));
                        ps.setString(++i, StringUtils.trimToNull(entity.getName()));
                        ps.setString(++i, StringUtils.trimToNull(entity.getHost()));
                        ps.setString(++i, StringUtils.trimToNull(entity.getCreateTime()));
                        ps.setString(++i, StringUtils.trimToNull(entity.getUpdateTime()));
                        ps.setString(++i, StringUtils.trimToNull(entity.getStatus()));
                        ps.setString(++i, StringUtils.trimToNull(entity.getCreater()));
                        ps.setString(++i, StringUtils.trimToNull(entity.getUpdater()));
                        ps.setString(++i, StringUtils.trimToNull(entity.getRemark()));
                        return ps;
                    }
                },
                keyHolder);
            String generatedId = Long.toString(keyHolder.getKey().longValue());
            entity.setId(generatedId);
        } catch (DataAccessException e) {
            logger.error("增加zookeeper信息错误：{}", e.getMessage());
            throw new SysException("10000", "增加zookeeper信息错误", e);
        }
        return entity;
    }

    @Override
    public int update(ZooKeeper entity) throws SysException {
        int rowsAffected;
        StringBuilder sql = new StringBuilder();
        sql.append("update zookeeper set ");

        List<Object> params = new ArrayList<Object>();
        try {
            if (StringUtils.isNotBlank(entity.getName())) {
                sql.append("name=?,");
                params.add(entity.getName());
            }
            if (StringUtils.isNotBlank(entity.getHost())) {
                sql.append("host=?,");
                params.add(entity.getHost());
            }
            if (StringUtils.isNotBlank(entity.getUpdater())) {
                sql.append("updater=?,");
                params.add(entity.getUpdater());
            }
            if (StringUtils.isNotBlank(entity.getUpdateTime())) {
                sql.append("update_time=str_to_date(?,'%Y-%m-%d %H:%i:%s'),");
                params.add(entity.getUpdateTime());
            }
            if (StringUtils.isNotBlank(entity.getStatus())) {
                sql.append("status=?,");
                params.add(entity.getStatus());
            }
            if (StringUtils.isNotBlank(entity.getRemark())) {
                sql.append("remark=?,");
                params.add(entity.getRemark());
            }
            sql.deleteCharAt(sql.length() - 1);
            sql.append(" where id=?");
            params.add(entity.getId());
            rowsAffected = jdbcTemplate.update(sql.toString(), params.toArray());
        } catch (DataAccessException e) {
            logger.error("更新zookeeper信息错误：{}", e.getMessage());
            throw new SysException("10000", "更新zookeeper信息错误", e);
        }
        return rowsAffected;
    }

    @Override
    public int delete(ZooKeeper entity) throws SysException {
        int rowsAffected;
        StringBuilder sql = new StringBuilder();
        sql.append("delete from zookeeper where id=?");

        try {
            rowsAffected = jdbcTemplate.update(sql.toString(), entity.getId());
        } catch (DataAccessException e) {
            logger.error("删除Patent错误：{}", e.getMessage());
            throw new SysException("10000", "删除Patent错误", e);
        }
        return rowsAffected;
    }

    @Override
    public List<ZooKeeper> queryList(ZooKeeper entity) throws SysException {
        StringBuffer sql = new StringBuffer();
        sql.append("select id, name, host, date_format(create_time,'%Y-%m-%d %H:%i:%s')create_time, date_format(update_time,'%Y-%m-%d %H:%i:%s')update_time, status, creater, updater, remark ");
        sql.append("from zookeeper ");
        sql.append("where 1=1");

        List<ZooKeeper> resultList = null;
        List<Object> params = new ArrayList<Object>();
        try {
            if (entity != null) {
                if (StringUtils.isNotBlank(entity.getId())) {
                    sql.append(" and id=?");
                    params.add(entity.getId());
                }
                if (StringUtils.isNotBlank(entity.getName())) {
                    sql.append(" and name=?");
                    params.add(entity.getName());
                }
                if (StringUtils.isNotBlank(entity.getHost())) {
                    sql.append(" and host=?");
                    params.add(entity.getHost());
                }
                if (StringUtils.isNotBlank(entity.getUpdater())) {
                    sql.append(" and updater=?");
                    params.add(entity.getUpdater());
                }
                if (StringUtils.isNotBlank(entity.getUpdateTime())) {
                    sql.append(" and update_time=str_to_date(?,'%Y-%m-%d %H:%i:%s')");
                    params.add(entity.getUpdateTime());
                }
                if (StringUtils.isNotBlank(entity.getStatus())) {
                    sql.append(" and status=?");
                    params.add(entity.getStatus());
                }
            }
            resultList = jdbcTemplate.query(sql.toString(),
                    params.toArray(),
                    new BeanPropertyRowMapper<ZooKeeper>(ZooKeeper.class));
        } catch (DataAccessException e) {
            logger.error("查询ZooKeeper信息错误：{}", e.getMessage());
            throw new SysException("10000", "查询ZooKeeper信息错误", e);
        }
        return resultList;
    }

    @Override
    public ZooKeeper queryBean(ZooKeeper entity) throws SysException {
        StringBuffer sql = new StringBuffer();
        sql.append("select id, name, host, date_format(create_time,'%Y-%m-%d %H:%i:%s')create_time, date_format(update_time,'%Y-%m-%d %H:%i:%s')update_time, status, creater, updater, remark ");
        sql.append("from zookeeper ");
        sql.append("where 1=1");

        List<Object> params = new ArrayList<Object>();
        try {
            if (entity != null) {
                if (StringUtils.isNotBlank(entity.getId())) {
                    sql.append(" and id=?");
                    params.add(entity.getId());
                }
                if (StringUtils.isNotBlank(entity.getName())) {
                    sql.append(" and name=?");
                    params.add(entity.getName());
                }
                if (StringUtils.isNotBlank(entity.getHost())) {
                    sql.append(" and host=?");
                    params.add(entity.getHost());
                }
                if (StringUtils.isNotBlank(entity.getUpdater())) {
                    sql.append(" and updater=?");
                    params.add(entity.getUpdater());
                }
                if (StringUtils.isNotBlank(entity.getUpdateTime())) {
                    sql.append(" and update_time=str_to_date(?,'%Y-%m-%d %H:%i:%s')");
                    params.add(entity.getUpdateTime());
                }
                if (StringUtils.isNotBlank(entity.getStatus())) {
                    sql.append(" and status=?");
                    params.add(entity.getStatus());
                }
            }
            entity = jdbcTemplate.queryForObject(sql.toString(),
                    params.toArray(),
                    new BeanPropertyRowMapper<ZooKeeper>(ZooKeeper.class));
        } catch (Exception e) {
            logger.error("查询ZooKeeper信息错误：{}", e.getMessage());
            throw new SysException("10000", "查询ZooKeeper信息错误", e);
        }
        return entity;
    }
}
