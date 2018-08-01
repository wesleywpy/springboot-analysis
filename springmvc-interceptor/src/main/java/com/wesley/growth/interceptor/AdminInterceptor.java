package com.wesley.growth.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

/**
 * @author Created by Wesley on 2018/8/1.
 */
@Slf4j
public class AdminInterceptor implements WebRequestInterceptor {

    @Override
    public void preHandle(WebRequest request) throws Exception {
        log.info("AdminInterceptor.preHandle");
    }

    @Override
    public void postHandle(WebRequest request, ModelMap model) throws Exception {
        log.info("AdminInterceptor.postHandle");
    }

    @Override
    public void afterCompletion(WebRequest request, Exception ex) throws Exception {
        log.info("AdminInterceptor.afterCompletion");
    }
}
