package com.atguigu.gmall.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.UserInfo;
import com.atguigu.gmall.service.UserInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;


@RestController
public class OrderController {
    @Reference
    private UserInfoService userInfoService;
    @RequestMapping("trade")
    public UserInfo trade(@PathParam("userId") String userId){
      return  userInfoService.getUserinforbyId(userId);

    }

}
