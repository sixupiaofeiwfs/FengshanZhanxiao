package com.fszx.crm.util.wechat;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fszx.crm.pojo.WechatUser;

import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.boot.json.JsonParser;


import java.util.List;
import java.util.Map;

//微信公众平台----用户管理工具类
public class UserUtils {

    //获取用户的基本信息
    private WechatUser getBasicUserInformation(String  cagJson){
        String headimgurl="";
        String nickname="";
        String openid="";
        int subscribe=0;
        int subscribe_time=0;
        UserInformation userInformation;

        //jackson的Objectmapper转换对象
        ObjectMapper mapper=new ObjectMapper();
        //将传递过来的字符串转化为微信用户对象(UserInformation)
        try {
             userInformation=mapper.readValue(cagJson,UserInformation.class);
        } catch (JsonProcessingException e) {
            userInformation=null;
            e.printStackTrace();
        }


        WechatUser wechatUser=new WechatUser();
        wechatUser.setHeadimgurl(userInformation.getHeadimgurl());
        wechatUser.setNickname(userInformation.getNickname());
        wechatUser.setOpenid(userInformation.getOpenid());
        wechatUser.setSubscribe(userInformation.getSubscribe());
        wechatUser.setSubscribe_time(userInformation.getSubscribe_time());

        return wechatUser;

    }




}
