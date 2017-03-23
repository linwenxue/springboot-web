package com.yongche.etl.controller;

import com.alibaba.fastjson.JSON;
import com.yongche.etl.base.BaseController;
import com.yongche.etl.entity.TaskConfig;
import com.yongche.etl.service.ITaskConfigService;
import com.yongche.etl.util.SysException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/etl/taskconfig")
public class TaskConfigController extends BaseController<TaskConfig> {
    private static Logger logger = LoggerFactory.getLogger(TaskConfigController.class);

    @Autowired
    private ITaskConfigService taskConfigService;


    @Override
    public String index() {
        return "index";
    }

    @Override
    public String search() throws Exception {
        return null;
    }

    @Override
    public String create() {
        try {
            model = taskConfigService.insert(model);
            setResponseMessage(SUCCESS, MESSAGE_CREATE_SUCCESS, null);
        } catch (SysException e) {
            setResponseErrorMessage(ERROR, e.getErrMsg());
            logger.error("增加taskConfig信息出错，错误信息：{}", e.getErrMsg());
        }
        return JSON.toJSONString(responseMessage);
    }

    @Override
    public String show() {
        try {
            model = taskConfigService.queryBean(model);
            setResponseMessage(SUCCESS, MESSAGE_SHOW_SUCCESS, model);
        } catch (SysException e) {
            setResponseErrorMessage(ERROR, e.getErrMsg());
            logger.error("查看taskConfig信息出错，错误信息：{}", e.getErrMsg());
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
            int affected = taskConfigService.update(model);
            if(affected < 1) throw new SysException("修改taskConfig信息出错，错误信息：{}", "修改taskConfig发生未知错误", null);
            setResponseMessage(SUCCESS, MESSAGE_UPDATE_SUCCESS, null);
        } catch (SysException e) {
            setResponseErrorMessage(ERROR, e.getErrMsg());
            logger.error("修改taskConfig信息出错，错误信息：{}", e.getErrMsg());
        }
        return JSON.toJSONString(responseMessage);
    }

    @Override
    public String destroy() {
        try {
            int affected = taskConfigService.delete(model);
            if(affected < 1) throw new SysException("删除taskConfig信息出错，错误信息：{}", "删除zookeeper发生未知错误", null);
            setResponseMessage(SUCCESS, MESSAGE_DELELE_SUCCESS, null);
        } catch (SysException e) {
            setResponseErrorMessage(ERROR, e.getErrMsg());
            logger.error("删除taskConfig信息出错，错误信息：{}", e.getErrMsg());
        }
        return JSON.toJSONString(responseMessage);
    }

    @RequestMapping(value = "/topic/{kafkaTopic}", method = RequestMethod.GET)
    public String queryByKafka() {
        try {
            List<TaskConfig> taskConfigs = taskConfigService.queryList(model);
            setResponseMessage(taskConfigs, SUCCESS, MESSAGE_SHOW_SUCCESS);
        } catch (SysException e) {
            setResponseErrorMessage(ERROR, e.getErrMsg());
            logger.error("查看taskConfig信息出错，错误信息：{}", e.getErrMsg());
        }
        return JSON.toJSONString(responseMessage);
    }
}