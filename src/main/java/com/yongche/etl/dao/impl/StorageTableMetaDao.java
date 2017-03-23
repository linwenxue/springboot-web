package com.yongche.etl.dao.impl;

import com.yongche.etl.base.BaseDao;
import com.yongche.etl.dao.IStorageTableMetaDao;
import com.yongche.etl.entity.StorageTableMeta;
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

@Repository
public class StorageTableMetaDao extends BaseDao implements IStorageTableMetaDao {
    private static Logger logger = LoggerFactory.getLogger(StorageTableMetaDao.class);

    @Override
    public StorageTableMeta insert(final StorageTableMeta entity) throws SysException {
        final StringBuilder sql = new StringBuilder();
        if(entity.getId()==null||entity.getId()==""){
            sql.append("INSERT INTO storage_table_meta (storage_meta_id,column_name,column_source,column_type,nullable,column_index,create_time,update_time,status,creater,updater,remark) ");
            sql.append("VALUES (?,?,?,?,?,?,str_to_date(?,'%Y-%m-%d %H:%i:%s'),str_to_date(?,'%Y-%m-%d %H:%i:%s'),?,?,?,?)");
            try {
                logger.info(sql.toString());
                KeyHolder keyHolder = new GeneratedKeyHolder();
                jdbcTemplate.update(
                    new PreparedStatementCreator(){
                        public PreparedStatement createPreparedStatement(Connection conn) throws SQLException{
                            int i = 0;
                            PreparedStatement ps = conn.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);
                            ps.setString(++i, StringUtils.trimToNull(entity.getStorageMetaId()));
                            ps.setString(++i, StringUtils.trimToNull(entity.getColumnName()));
                            ps.setString(++i, StringUtils.trimToNull(entity.getColumnSource()));
                            ps.setString(++i, StringUtils.trimToNull(entity.getColumnType()));
                            ps.setString(++i, StringUtils.trimToNull(entity.getNullable()));
                            ps.setString(++i, StringUtils.trimToNull(entity.getColumnIndex()));
                            ps.setString(++i, StringUtils.trimToNull(entity.getCreateTime()));
                            ps.setString(++i, StringUtils.trimToNull(entity.getUpdateTime()));
                            ps.setString(++i, StringUtils.trimToNull(entity.getStatus()));
                            ps.setString(++i, StringUtils.trimToNull(entity.getCreater()));
                            ps.setString(++i, StringUtils.trimToNull(entity.getUpdater()));
                            ps.setString(++i, StringUtils.trimToNull(entity.getRemark()));
                            return ps;
                        }
                    },keyHolder);

                String generatedId = Long.toString(keyHolder.getKey().longValue());
                entity.setId(generatedId);
            }catch (DataAccessException e) {
                logger.error("增加storage_table_meta错误：{}", e.getMessage());
                throw new SysException("10000", "增加storage_table_meta错误", e);
            }
        }else{
            sql.append("INSERT INTO storage_table_meta (id,storage_meta_id,column_name,column_source,column_type,nullable,column_index,create_time,update_time,status,creater,updater,remark) ");
            sql.append("VALUES (?,?,?,?,?,?,?,str_to_date(?,'%Y-%m-%d %H:%i:%s'),str_to_date(?,'%Y-%m-%d %H:%i:%s'),?,?,?,?)");
            try {
                logger.info(sql.toString());
                jdbcTemplate.update(
                    new PreparedStatementCreator(){
                        public PreparedStatement createPreparedStatement(Connection conn) throws SQLException{
                        int i = 0;
                        PreparedStatement ps = conn.prepareStatement(sql.toString());
                        ps.setString(++i, StringUtils.trimToNull(entity.getId()));
                        ps.setString(++i, StringUtils.trimToNull(entity.getStorageMetaId()));
                        ps.setString(++i, StringUtils.trimToNull(entity.getColumnName()));
                        ps.setString(++i, StringUtils.trimToNull(entity.getColumnSource()));
                        ps.setString(++i, StringUtils.trimToNull(entity.getColumnType()));
                        ps.setString(++i, StringUtils.trimToNull(entity.getNullable()));
                        ps.setString(++i, StringUtils.trimToNull(entity.getColumnIndex()));
                        ps.setString(++i, StringUtils.trimToNull(entity.getCreateTime()));
                        ps.setString(++i, StringUtils.trimToNull(entity.getUpdateTime()));
                        ps.setString(++i, StringUtils.trimToNull(entity.getStatus()));
                        ps.setString(++i, StringUtils.trimToNull(entity.getCreater()));
                        ps.setString(++i, StringUtils.trimToNull(entity.getUpdater()));
                        ps.setString(++i, StringUtils.trimToNull(entity.getRemark()));
                        return ps;
                        }
                    });
            } catch (DataAccessException e) {
                logger.error("增加storage_table_meta错误：{}", e.getMessage());
                throw new SysException("10000", "增加storage_table_meta错误", e);
            }
        }
        return entity;
    }

    @Override
    public int update(StorageTableMeta entity) throws SysException {
        int rowsAffected;
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE storage_table_meta SET ");
        // 判断主键是否为空
        if (StringUtils.isBlank(entity.getId())){
            throw new SysException("100001", "修改storage_table_meta错误：主键Id为空", null);
        }
        List<Object> params = new ArrayList<Object>();
        try {


            if(StringUtils.isNotBlank(entity.getStorageMetaId())){
                sql.append("storage_meta_id=?,");
                params.add(entity.getStorageMetaId());
            }

            if(StringUtils.isNotBlank(entity.getColumnName())){
                sql.append("column_name=?,");
                params.add(entity.getColumnName());
            }

            if(StringUtils.isNotBlank(entity.getColumnSource())){
                sql.append("column_source=?,");
                params.add(entity.getColumnSource());
            }

            if(StringUtils.isNotBlank(entity.getColumnType())){
                sql.append("column_type=?,");
                params.add(entity.getColumnType());
            }

            if(StringUtils.isNotBlank(entity.getNullable())){
                sql.append("nullable=?,");
                params.add(entity.getNullable());
            }

            if(StringUtils.isNotBlank(entity.getColumnIndex())){
                sql.append("column_index=?,");
                params.add(entity.getColumnIndex());
            }

            if(StringUtils.isNotBlank(entity.getCreateTime())){
                sql.append("create_time=str_to_date(?,'%Y-%m-%d %H:%i:%s'),");
                params.add(entity.getCreateTime());
            }

            if(StringUtils.isNotBlank(entity.getUpdateTime())){
                sql.append("update_time=str_to_date(?,'%Y-%m-%d %H:%i:%s'),");
                params.add(entity.getUpdateTime());
            }

            if(StringUtils.isNotBlank(entity.getStatus())){
                sql.append("status=?,");
                params.add(entity.getStatus());
            }

            if(StringUtils.isNotBlank(entity.getCreater())){
                sql.append("creater=?,");
                params.add(entity.getCreater());
            }

            if(StringUtils.isNotBlank(entity.getUpdater())){
                sql.append("updater=?,");
                params.add(entity.getUpdater());
            }

            if(StringUtils.isNotBlank(entity.getRemark())){
                sql.append("remark=?,");
                params.add(entity.getRemark());
            }
            sql.deleteCharAt(sql.length() - 1);
            sql.append(" WHERE id=?");
            params.add(entity.getId());
            logger.info(sql.toString());
            rowsAffected = jdbcTemplate.update(sql.toString(), params.toArray());
        } catch (DataAccessException e) {
            e.printStackTrace();
            logger.error("更新storage_table_meta错误：{}", e.getMessage());
            throw new SysException("10000", "更新storage_table_meta错误", e);
        }
        return rowsAffected;
    }

    @Override
    public int delete(StorageTableMeta entity) throws SysException {
        int rowsAffected;
        StringBuilder sql = new StringBuilder();
        // 判断主键是否为空
        if (StringUtils.isBlank(entity.getId())){
            throw new SysException("100001", "删除storage_table_meta错误：主键Id为空", null);
        }
        sql.append("UPDATE storage_table_meta ");
        sql.append("SET status=?,update_time=str_to_date(?,'%Y-%m-%d %H:%i:%s') WHERE id=?");

        try {
            logger.info(sql.toString());
            rowsAffected = jdbcTemplate.update(sql.toString(),
                   entity.getStatus(),
                   entity.getUpdateTime(),
                   entity.getId());
        } catch (DataAccessException e) {
            logger.error("删除storage_table_meta错误：{}", e.getMessage());
            throw new SysException("10000", "删除storage_table_meta错误", e);
        }
        return rowsAffected;
    }

    @Override
    public List<StorageTableMeta> queryList(StorageTableMeta entity) throws SysException {
    StringBuffer sql = new StringBuffer();
        sql.append("SELECT id,storage_meta_id,column_name,column_source,column_type,nullable,column_index,date_format(create_time,'%Y-%m-%d %H:%i:%s')create_time,date_format(update_time,'%Y-%m-%d %H:%i:%s')update_time,status,creater,updater,remark ");
        sql.append("FROM storage_table_meta ");
        sql.append("WHERE 1=1");

        List<StorageTableMeta> resultList = null;
        List<Object> params = new ArrayList<Object>();
        try {
            if (entity != null) {
                if (StringUtils.isNotBlank(entity.getId())) {
                    sql.append(" AND id=?");
                    params.add(entity.getId());
                }
                if (StringUtils.isNotBlank(entity.getStorageMetaId())) {
                    sql.append(" AND storage_meta_id=?");
                    params.add(entity.getStorageMetaId());
                }
                if (StringUtils.isNotBlank(entity.getColumnName())) {
                    sql.append(" AND column_name=?");
                    params.add(entity.getColumnName());
                }
                if (StringUtils.isNotBlank(entity.getColumnSource())) {
                    sql.append(" AND column_source=?");
                    params.add(entity.getColumnSource());
                }
                if (StringUtils.isNotBlank(entity.getColumnType())) {
                    sql.append(" AND column_type=?");
                    params.add(entity.getColumnType());
                }
                if (StringUtils.isNotBlank(entity.getNullable())) {
                    sql.append(" AND nullable=?");
                    params.add(entity.getNullable());
                }
                if (StringUtils.isNotBlank(entity.getColumnIndex())) {
                    sql.append(" AND column_index=?");
                    params.add(entity.getColumnIndex());
                }
                if (StringUtils.isNotBlank(entity.getCreateTime())) {
                    sql.append(" AND create_time=str_to_date(?,'%Y-%m-%d %H:%i:%s')");
                    params.add(entity.getCreateTime());
                }
                if (StringUtils.isNotBlank(entity.getUpdateTime())) {
                    sql.append(" AND update_time=str_to_date(?,'%Y-%m-%d %H:%i:%s')");
                    params.add(entity.getUpdateTime());
                }
                if (StringUtils.isNotBlank(entity.getStatus())) {
                    sql.append(" AND status=?");
                    params.add(entity.getStatus());
                }
                if (StringUtils.isNotBlank(entity.getCreater())) {
                    sql.append(" AND creater=?");
                    params.add(entity.getCreater());
                }
                if (StringUtils.isNotBlank(entity.getUpdater())) {
                    sql.append(" AND updater=?");
                    params.add(entity.getUpdater());
                }
                if (StringUtils.isNotBlank(entity.getRemark())) {
                    sql.append(" AND remark like ? ");
                    params.add("%" + entity.getRemark() + "%");
                }
            } else {
                sql.append(" AND 1=2");
            }
            logger.info(sql.toString());
            resultList = jdbcTemplate.query(sql.toString(),
                    params.toArray(),
                    new BeanPropertyRowMapper<StorageTableMeta>(StorageTableMeta.class));
        } catch (DataAccessException e) {
            logger.error("查询storage_table_meta错误：{}", e.getMessage());
            throw new SysException("10000", "查询storage_table_meta错误", e);
        }
        return resultList;
    }

    @Override
    public StorageTableMeta queryBean(StorageTableMeta entity) throws SysException {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT id,storage_meta_id,column_name,column_source,column_type,nullable,column_index,DATE_FORMAT(create_time,'%Y-%m-%d %H:%i:%s')create_time,DATE_FORMAT(update_time,'%Y-%m-%d %H:%i:%s')update_time,status,creater,updater,remark ");
        sql.append("FROM storage_table_meta ");
        sql.append("WHERE 1=1");

        List<Object> params = new ArrayList<Object>();
        try {
            if (entity != null) {
                if (StringUtils.isBlank(entity.getId())){
                    throw new SysException("100001", "根据主键查询STORAGE_TABLE_META错误：主键id为空", null);
                }
                sql.append(" AND id=?");
                params.add(entity.getId());
            } else {
                sql.append(" AND 1=2");
            }
            logger.info(sql.toString());
            entity = jdbcTemplate.queryForObject(sql.toString(),
                    params.toArray(),
                new BeanPropertyRowMapper<StorageTableMeta>(StorageTableMeta.class));
        } catch (Exception e) {
            logger.error("查询storage_table_meta错误：{}", e.getMessage());
            throw new SysException("10000", "查询storage_table_meta错误", e);
        }
        return entity;
    }
}