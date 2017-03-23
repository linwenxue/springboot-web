package com.yongche.etl.controller;

import com.alibaba.fastjson.JSON;
import com.yongche.etl.service.IAlarmInstanceService;
import com.yongche.etl.entity.AlarmInstance;
import com.yongche.etl.base.BaseController;
import com.yongche.etl.util.SysException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/etl/alarminstance")
public class AlarmInstanceController extends BaseController<AlarmInstance> {
    private static Logger logger = LoggerFactory.getLogger(AlarmInstanceController.class);

    @Autowired
    private IAlarmInstanceService alarmInstanceService;


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
            model = alarmInstanceService.insert(model);
            setResponseMessage(SUCCESS, MESSAGE_CREATE_SUCCESS, null);
        } catch (SysException e) {
            setResponseMessage(ERROR, e.getErrMsg(), null);
            logger.error("增加alarmInstance信息出错，错误信息：{}", e.getErrMsg());
        }
        return JSON.toJSONString(responseMessage);
    }

    @Override
    public String show() {
        try {
            model = alarmInstanceService.queryBean(model);
            setResponseMessage(SUCCESS, MESSAGE_SHOW_SUCCESS, model);
        } catch (SysException e) {
            setResponseErrorMessage(ERROR, e.getErrMsg());
            logger.error("查看alarmInstance信息出错，错误信息：{}", e.getErrMsg());
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
            int affected = alarmInstanceService.update(model);
            if(affected < 1) throw new SysException("修改alarmInstance信息出错，错误信息：{}", "修改alarmInstance发生未知错误", null);
            setResponseMessage(SUCCESS, MESSAGE_UPDATE_SUCCESS, null);
        } catch (SysException e) {
            setResponseErrorMessage(ERROR, e.getErrMsg());
            logger.error("修改alarmInstance信息出错，错误信息：{}", e.getErrMsg());
        }
        return JSON.toJSONString(responseMessage);
    }

    @Override
    public String destroy() {
        try {
            int affected = alarmInstanceService.delete(model);
            if(affected < 1) throw new SysException("删除alarmInstance信息出错，错误信息：{}", "删除zookeeper发生未知错误", null);
            setResponseMessage(SUCCESS, MESSAGE_DELELE_SUCCESS, null);
        } catch (SysException e) {
            setResponseErrorMessage(ERROR, e.getErrMsg());
            logger.error("删除alarmInstance信息出错，错误信息：{}", e.getErrMsg());
        }
        return JSON.toJSONString(responseMessage);
    }
}