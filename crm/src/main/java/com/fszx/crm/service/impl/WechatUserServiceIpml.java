package com.fszx.crm.service.impl;

import com.fszx.crm.dao.WechatUserMapper;
import com.fszx.crm.pojo.WechatUser;
import com.fszx.crm.service.WechatUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class WechatUserServiceIpml implements WechatUserService {

   @Autowired
    WechatUserMapper wechatUserMapper;


    @Override
    public int add(WechatUser wechatUser) {

        int insert=wechatUserMapper.insert(wechatUser);

        return insert;
    }

    @Override
    public int delete(String openid) {
        int delete=wechatUserMapper.deleteById(openid);
        return delete;
    }

    @Override
    public int update(WechatUser wechatUser) {

        return wechatUserMapper.updateById(wechatUser);

    }

    @Override
    public WechatUser queryByOpenid(String openid) {

       return wechatUserMapper.selectById(openid);

    }
}
