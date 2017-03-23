package com.yongche.etl.common;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * 注册sitemesh过滤器
 *
 * Created by wenxuelin on 2017/2/8.
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Bean
    public FilterRegistrationBean siteMeshFilter(){
        FilterRegistrationBean fitler = new FilterRegistrationBean();
        WebSiteMeshFilter siteMeshFilter = new WebSiteMeshFilter();
        fitler.setFilter(siteMeshFilter);
        return fitler;
    }
}
