package com.yongche.etl.controller;

import com.alibaba.fastjson.JSON;
import com.yongche.etl.base.BaseController;
import com.yongche.etl.entity.ZooKeeper;
import com.yongche.etl.service.IZookeeperService;
import com.yongche.etl.util.SysException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wenxuelin on 2017/1/5.
 */
@Controller
@RequestMapping("/etl/zookeeper")
public class ZooKeeperController extends BaseController<ZooKeeper> {
    private Logger logger =  LoggerFactory.getLogger(ZooKeeperController.class);

    @Autowired
    private IZookeeperService zookeeperService;


    @Override
    public String index() {
        return null;
    }

    @Override
    public String search() throws Exception {
        return null;
    }

    @Override
    public String create() {
        try {
            model = zookeeperService.insert(model);
            setResponseMessage(SUCCESS, MESSAGE_CREATE_SUCCESS, null);
        } catch (SysException e) {
            setResponseErrorMessage(ERROR, e.getErrMsg());
            logger.error("增加zooKeeper信息出错，错误信息：{}", e.getErrMsg());
        }
        return JSON.toJSONString(responseMessage);
    }

    @Override
    public String show() {
        try {
            model = zookeeperService.queryBean(model);
            setResponseMessage(SUCCESS, MESSAGE_SHOW_SUCCESS, model);
        } catch (SysException e) {
            setResponseErrorMessage(ERROR, e.getErrMsg());
            logger.error("查看zooKeeper信息出错，错误信息：{}", e.getErrMsg());
        }
        return JSON.toJSONString(responseMessage);
    }

    @Override
    public String edit() {
        return null;
    }

    @Override
    public String editNew() {
        return null;
    }

    @Override
    public String update() {
        try {
            int affected = zookeeperService.update(model);
            if(affected < 1) throw new SysException("修改zooKeeper信息出错，错误信息：{}", "修改zookeeper发生未知错误", null);
            setResponseMessage(SUCCESS, MESSAGE_UPDATE_SUCCESS, null);
        } catch (SysException e) {
            setResponseErrorMessage(ERROR, e.getErrMsg());
            logger.error("修改zooKeeper信息出错，错误信息：{}", e.getErrMsg());
        }
        return JSON.toJSONString(responseMessage);
    }

    @Override
    public String destroy() {
        try {
            int affected = zookeeperService.delete(model);
            if(affected < 1) throw new SysException("删除zooKeeper信息出错，错误信息：{}", "删除zookeeper发生未知错误", null);
            setResponseMessage(SUCCESS, MESSAGE_DELELE_SUCCESS, null);
        } catch (SysException e) {
            setResponseErrorMessage(ERROR, e.getErrMsg());
            logger.error("删除zooKeeper信息出错，错误信息：{}", e.getErrMsg());
        }
        return JSON.toJSONString(responseMessage);
    }
}
