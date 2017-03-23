package com.yongche.etl.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by wenxuelin on 2017/1/5.
 */
@Repository
public abstract class BaseDao {
    @Autowired
    protected JdbcTemplate jdbcTemplate;
}
