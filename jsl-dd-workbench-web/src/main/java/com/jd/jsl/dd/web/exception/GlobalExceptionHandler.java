package com.jd.jsl.dd.web.exception;

import com.jd.jsl.dd.domain.result.ResCode;
import com.jd.jsl.dd.domain.result.ResponseRes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 全局异常处理
 * @author wujia215
 * @date 2020/3/910:39
 */
@Slf4j
@CrossOrigin
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseRes processException(Exception ex, HttpServletRequest request, HttpServletResponse response) {

        log.error("GlobalExceptionHandler found exception : {}",ex.getMessage(),ex);
        return new ResponseRes(ResCode.FAILED,ex.toString(),null);

    }

}
