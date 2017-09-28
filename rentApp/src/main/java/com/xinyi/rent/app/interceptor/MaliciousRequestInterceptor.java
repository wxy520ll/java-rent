package com.xinyi.rent.app.interceptor;

import com.xinyi.rent.app.Constants;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by wxy on 2017/9/25.
 */
public class MaliciousRequestInterceptor extends BaseInterceptor {

    private Boolean allRequest = false; // 拦截所有请求,否则拦截相同请求

    private Long minRequestIntervalTime = 500L; // 允许的最小请求间隔

    private Integer maxMaliciousTimes = 0; // 允许的最大恶意请求次数

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest,
                             HttpServletResponse httpServletResponse, Object o) throws Exception {

        HttpSession session = httpServletRequest.getSession();
        String preRequest = (String) session.getAttribute(Constants.PREREQUEST);
        Long preRequestTime = (Long) session.getAttribute(Constants.PREREQUEST_TIME);
        String url=httpServletRequest.getServletPath();
        if (!StringUtils.isEmpty(preRequest)&&preRequestTime != null){
            if ((url.equals(preRequest) || allRequest)
                    && System.currentTimeMillis() - preRequestTime < minRequestIntervalTime) {
                Integer maliciousRequestTimes = (Integer) session.getAttribute(Constants.MALICIOUS_REQUEST_TIMES);
                if (maliciousRequestTimes == null) {
                    maliciousRequestTimes = 1;
                } else {
                    maliciousRequestTimes++;
                }
                session.setAttribute(Constants.MALICIOUS_REQUEST_TIMES, maliciousRequestTimes);
                if (maliciousRequestTimes > maxMaliciousTimes) {
                    logger.info("拦截恶意请求");
                    httpServletResponse.setStatus(500);
                    return false;
                }
            } else {
                session.setAttribute(Constants.MALICIOUS_REQUEST_TIMES, 0);
            }
        }
        session.setAttribute(Constants.PREREQUEST, url);
        session.setAttribute(Constants.PREREQUEST_TIME, System.currentTimeMillis());
        return super.preHandle(httpServletRequest, httpServletResponse, o);
    }
}
