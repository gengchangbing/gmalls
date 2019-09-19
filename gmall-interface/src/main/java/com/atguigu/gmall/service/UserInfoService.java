package com.atguigu.gmall.service;

import com.atguigu.gmall.UserAddress;
import com.atguigu.gmall.UserInfo;

import java.util.List;

public interface UserInfoService {
    List<UserInfo> getUserInfoList();
    List<UserAddress> getUserAddressList(String userId);
    UserInfo getUserinforbyId(String id);
    void  addUser(UserInfo userInfo);
    void updatUser(UserInfo userInfo);
    void deteleterUserById(String id);
}

