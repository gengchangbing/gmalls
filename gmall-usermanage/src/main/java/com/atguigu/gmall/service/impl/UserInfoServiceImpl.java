package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.UserAddress;
import com.atguigu.gmall.UserInfo;
import com.atguigu.gmall.service.UserInfoService;
import com.atguigu.gmall.mapper.UserAddressMapper;
import com.atguigu.gmall.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@com.alibaba.dubbo.config.annotation.Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private UserAddressMapper userAddressMapper;
    @Override
    public List<UserInfo> getUserInfoList() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        // 调用mapper
        // select * from userAddress where userId=?
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        return    userAddressMapper.select(userAddress);

    }

    @Override
    public UserInfo getUserinforbyId(String id) {
      return  userInfoMapper.selectByPrimaryKey(id);
    }
}

