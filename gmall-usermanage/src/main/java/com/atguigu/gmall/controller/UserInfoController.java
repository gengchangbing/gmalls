package com.atguigu.gmall.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.UserAddress;
import com.atguigu.gmall.UserInfo;
import com.atguigu.gmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserInfoController {

  @Reference
    private UserInfoService userInfoService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<UserInfo> findAll(){
        List<UserInfo> userInfoList = userInfoService.getUserInfoList();
        return userInfoList;
    }
    @RequestMapping("updatUser")
    public void updatUser(UserInfo userInfo){

        userInfoService.updatUser(userInfo);
    }

    @RequestMapping("getUserAddressList")
    List<UserAddress> getUserAddressList(String userId){

       return  userInfoService.getUserAddressList(userId);
    }
    @RequestMapping("findAll")
  public  UserInfo getUserinforbyId(String id){

      return userInfoService.getUserinforbyId(id);

    }
    @RequestMapping("addUser")
   public void  addUser(UserInfo userInfo){

        userInfoService.addUser(userInfo);


    }
    @RequestMapping("deleteUserById")
 public void  deleteUserById(String id){

        userInfoService.deteleterUserById(id);

}

}
