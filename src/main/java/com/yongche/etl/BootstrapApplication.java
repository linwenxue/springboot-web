package com.yongche.etl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by wenxuelin on 2017/1/5.
 */
@EnableTransactionManagement
@SpringBootApplication
public class BootstrapApplication {
    public static void main(String[] args) {
        SpringApplication.run(com.yongche.etl.BootstrapApplication.class, args);
    }

    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {
        return new EmbeddedServletContainerCustomizer() {
            @Override
            public void customize(ConfigurableEmbeddedServletContainer container) {

                ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/exception/401.html");
                ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/exception/404.html");
                ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/exception/500.html");

                container.addErrorPages(error401Page, error404Page, error500Page);
            }
        };
    }
}

