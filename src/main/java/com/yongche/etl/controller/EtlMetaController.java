package com.yongche.etl.controller;

import com.yongche.etl.base.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wenxuelin on 2017/2/7.
 */
@Controller
@RequestMapping("/etl/meta")
public class EtlMetaController extends BaseController<Object> {
    private Logger logger =  LoggerFactory.getLogger(EtlMetaController.class);


    @Override
    public String index() {
        return "/etl/meta";
    }

    @Override
    public String search() throws Exception {
        return null;
    }

    @Override
    public String create() {
        return null;
    }

    @Override
    public String show() {
        return null;
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
        return null;
    }

    @Override
    public String destroy() {
        return null;
    }
}
