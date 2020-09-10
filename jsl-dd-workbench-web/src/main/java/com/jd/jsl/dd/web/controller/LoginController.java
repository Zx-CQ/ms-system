package com.jd.jsl.dd.web.controller;

import com.jd.jsl.dd.domain.DTO.LoginDTO;
import com.jd.jsl.dd.domain.result.ResCode;
import com.jd.jsl.dd.domain.result.ResponseRes;
import com.jd.jsl.dd.service.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 登录模块
 * @author wujia215
 * @date 2020/8/1112:56
 */
@Slf4j
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    /*** 登录校验 ***/
    @PostMapping("/checkLogin")
    public ResponseRes checkLogin( @RequestBody LoginDTO loginDTO){

        return new ResponseRes(ResCode.SUCCESS,null);
    }

    /*** 退出登录 ***/
    @PostMapping("/loginOut")
    public ResponseRes loginOut(@RequestBody LoginDTO loginDTO){

        return new ResponseRes(ResCode.SUCCESS,null);
    }

    /*** 校验token ****/
    @PostMapping("/checkToken")
    public ResponseRes checkToken(@RequestBody LoginDTO loginDTO){
        return new ResponseRes(ResCode.SUCCESS,null);
    }

}
