package com.atguigu.gmall.service;


import com.atguigu.gmall.BaseAttrInfo;
import com.atguigu.gmall.BaseCatalog1;
import com.atguigu.gmall.BaseCatalog2;
import com.atguigu.gmall.BaseCatalog3;

import java.util.List;

public interface ManageService {

    public List<BaseCatalog1> getCatalog1();

    public List<BaseCatalog2> getCatalog2(String catalog1Id);

    public List<BaseCatalog3> getCatalog3(String catalog2Id);

    public List<BaseAttrInfo> getAttrList(String catalog3Id);

    void saveAttrInfo(BaseAttrInfo baseAttrInfo);
}
