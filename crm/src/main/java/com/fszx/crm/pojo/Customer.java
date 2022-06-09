package com.fszx.crm.pojo;

import java.util.Date;

//顾客类
public class Customer extends WechatUser{
    private String telephone;
    private String verificationCode;//验证码
    private Date registrationTime;//注册时间
}
