package com.wsw.demoweb.controller;

import com.wsw.demobase.entity.ResponseBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WSW
 * @date 2020/5/3 10:43
 */
@RestController
public class LoginController {
    @GetMapping("/login")
    public ResponseBean login(){
        return ResponseBean.error("尚未登录，请登录！");
    }
}
