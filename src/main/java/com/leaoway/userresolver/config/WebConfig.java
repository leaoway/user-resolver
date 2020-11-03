package com.leaoway.userresolver.config;

import java.util.List;
import javax.annotation.Resource;

import com.leaoway.userresolver.resolver.UserBeanResolver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    @Resource
    private ApplicationContext context;

    @Override
    protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(getUserBeanResolver());
    }

    private UserBeanResolver getUserBeanResolver() {
        return context.getBean(UserBeanResolver.class);
    }
}
