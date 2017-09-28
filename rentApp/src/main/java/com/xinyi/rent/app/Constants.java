package com.xinyi.rent.app;

import org.springframework.context.annotation.Configuration;

/**
 * Created by wxy on 2017/9/25.
 */

@Configuration
public class Constants {

    /**
     * 上次请求地址
     */
    public static final String PREREQUEST = "PREREQUEST";
    /**
     * 上次请求时间
     */
    public static final String PREREQUEST_TIME = "PREREQUEST_TIME";

    /**
     * 非法请求次数
     */
    public static final String MALICIOUS_REQUEST_TIMES = "MALICIOUS_REQUEST_TIMES";
}
