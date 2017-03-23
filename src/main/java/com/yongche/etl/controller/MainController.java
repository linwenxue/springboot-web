package com.yongche.etl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * mainController主要完成系统通用功能
 *
 * Created by wenxuelin on 2017/2/7.
 */
@Controller
public class MainController{
    /**
     * 用户登录方法
     * @return
     */
    @RequestMapping(value="/login")
    public String login() {
        if(false) {//权限验证成功
            return index();
        }
        return "login";
    }


    /**
     * 用户注销方法
     * @return
     */
    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logout() {
        /**
         * 用户权限注销逻辑
         */
        return "login";
    }


    /**
     * 用户注册方法
     * @return
     */
    @RequestMapping(value="/register")
    public String register() {
        return "register";
    }


    /**
     * 跳转主页面方法
     * @return
     */
    @RequestMapping(value="/index")
    public String index() {
        /**
         *
         * 1.鉴权用户信息
         * 2.查询用户权限
         */
        System.out.println("测试环境***************");
        return "index";
    }


    /**
     * 统一sitemesh装饰器入口方法
     * @return
     */
    @RequestMapping(value="/decorator")
    public String decorator() {
        System.out.println("测试环境***************");
        return "decorator";
    }


    /**
     * 系统锁屏方法
     * @return
     */
    @RequestMapping(value="/lockscreen")
    public String lockStreen() {
        return "lockscreen";
    }
}
