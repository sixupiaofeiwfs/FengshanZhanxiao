package com.fszx.crm.service;

import com.fszx.crm.dao.WechatUserMapper;
import com.fszx.crm.pojo.WechatUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface WechatUserService {

    int add(WechatUser wechatUser);

    int delete(String openid);

    int update(WechatUser wechatUser);

    WechatUser queryByOpenid(String openid);




}
