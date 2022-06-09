package com.fszx.crm.dao;


//import com.fszx.crm.pojo.WechatUser;
//import org.apache.ibatis.annotations.Insert;
//import org.springframework.stereotype.Component;
//import org.apache.ibatis.annotations.Mapper;
//
//
//@Component
//@Mapper
//public interface WechatUserMapper {
//    @Insert("insert into wechatUser(openid,nickname,headimgurl,subscribe,subscribe_time) values(#{openid},#{nickname},#{headimgurl},#{subscribe},#{subscribe_time})")
//    int add(WechatUser wechatUser);
//
//}




/*
* 以上方法为使用mybatis框架的源码,上面源码仅保留了add方法,方法非常复杂, 不再考虑使用
* 采用mybatisplus 代码如下
*
* */


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fszx.crm.pojo.WechatUser;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public interface WechatUserMapper extends BaseMapper<WechatUser> {


}