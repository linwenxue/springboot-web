package com.yongche.etl.common;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

/**
 * sitemesh过滤器
 * Created by wenxuelin on 2017/2/8.
 */
public class WebSiteMeshFilter extends ConfigurableSiteMeshFilter {
    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        builder.addDecoratorPath("/*", "/decorator")
                .addExcludedPath("/login")
                .addExcludedPath("/register")
                .addExcludedPath("/logout")
                .addExcludedPath("/lockscreen")
                .addExcludedPath("/js/*")
                .addExcludedPath("/fonts/*")
                .addExcludedPath("/exception/*")
                .addExcludedPath("/img/*")
                .addExcludedPath("/font-awesome/*")
                .addExcludedPath("/css/*");
    }
}
