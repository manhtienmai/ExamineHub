//package com.sat.sat_exam_website.common.interceptor;
//
//@Slf4j
//public class LoggingInterceptor implements HandlerInterceptor {
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
//        log.info("Request URL: {} {}", request.getMethod(), request.getRequestURI());
//        return true;
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
//                                Object handler, Exception ex) {
//        log.info("Response Status: {}", response.getStatus());
//        if (ex != null) {
//            log.error("Exception: ", ex);
//        }
//    }
//}