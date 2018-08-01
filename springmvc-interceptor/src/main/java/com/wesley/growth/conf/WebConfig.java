package com.wesley.growth.conf;

import com.wesley.growth.interceptor.AdminInterceptor;
import com.wesley.growth.interceptor.LoginInterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Created by Wesley on 2018/8/1.
 */
@SpringBootConfiguration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**");

        registry.addWebRequestInterceptor(new AdminInterceptor())
                .addPathPatterns("/admin");

    }

}
