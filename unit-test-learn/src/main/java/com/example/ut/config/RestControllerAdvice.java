//package com.example.ut.config;
//
//import com.example.ut.common.ApiResponse;
//import com.example.ut.common.StatusCode;
//import org.apache.commons.lang3.StringUtils;
//import org.slf4j.MDC;
//import org.springframework.core.MethodParameter;
//import org.springframework.http.MediaType;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.http.server.ServerHttpRequest;
//import org.springframework.http.server.ServerHttpResponse;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
//
///**
// * @description: test
// * @author: zhaozhen
// * @create: 2023/02/18 22:34
// */
//@ControllerAdvice("com.example.ut")
//public class RestControllerAdvice implements ResponseBodyAdvice<Object> {
//
//    private static final String VOID = "void";
//    @Override
//    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
//        return true;
//    }
//
//    @Override
//    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
//                                  Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
//                                  ServerHttpResponse response) {
//        if (VOID.equals(getReturnName(returnType))) {
//            return null;
//        }
//
//        if (isBasicType(returnType)) {
//            return body;
//        }
//
//
//        if (body == null) {
//            return  ApiResponse.of(null,StatusCode.OK);
//        }
//        if (!(body instanceof ApiResponse)) {
//            return  ApiResponse.of(body, StatusCode.OK);
//        }
//        else {
//            ApiResponse commonResult = (ApiResponse) body;
//            return commonResult;
//        }
//    }
//
//    private String getReturnName(MethodParameter returnType) {
//        if (returnType == null || returnType.getMethod() == null) {
//            return StringUtils.EMPTY;
//        }
//        return returnType.getMethod().getReturnType().getName();
//
//    }
//
//    private boolean isBasicType(MethodParameter returnType) {
//
//        if (returnType == null || returnType.getMethod() == null) {
//            return true;
//        }
//
//        String name = returnType.getMethod().getReturnType().getSimpleName();
//        switch (name) {
//            case "String":
//            case "byte[]":
//            case "ResponseEntity":
//                return true;
//            default:
//                return false;
//        }
//
//    }
//}
