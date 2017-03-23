package com.yongche.etl.base;

import org.springframework.stereotype.Service;

/**
 * Created by wenxuelin on 2017/1/5.
 */
@Service
public abstract class BaseService {
    protected final static String STS_NORMAL = "A";
    protected final static String STS_HISTORY = "P";

}
