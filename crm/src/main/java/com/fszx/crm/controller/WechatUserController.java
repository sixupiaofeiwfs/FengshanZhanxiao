package com.fszx.crm.controller;


import com.fszx.crm.pojo.WechatUser;
import com.fszx.crm.service.WechatUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aaa")
public class WechatUserController {
    @Autowired
    WechatUserService wechatUserService;

    WechatUser wechatUser;


    public int add(String openid,String nickname,String headimgurl,int subscribe,int subscribe_time){
        wechatUser=new WechatUser();
        wechatUser.setOpenid(openid);
        wechatUser.setNickname(nickname);
        wechatUser.setHeadimgurl(headimgurl);
        wechatUser.setSubscribe(subscribe);
        wechatUser.setSubscribe_time(subscribe_time);
        return wechatUserService.add(wechatUser);
    }
}
