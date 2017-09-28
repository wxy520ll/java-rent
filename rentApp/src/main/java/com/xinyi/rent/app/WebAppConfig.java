package com.xinyi.rent.app;

import com.xinyi.rent.app.interceptor.MaliciousRequestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by wxy on 2017/9/25.
 */

@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(new MaliciousRequestInterceptor()).addPathPatterns("/api/**");
    }
}
