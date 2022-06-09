package com.fszx.crm.pojo;

public class WechatUser extends Tourist{

    private String openid;
    private String nickname;
    private String headimgurl;  //头像
    private int subscribe;//关注公众号标识  1代表关注公众号 0代表未关注  注意该字段在用户取消关注后或重新关注后会有一定时间的延时
    private int subscribe_time;//关注公众号的时间 如果存在多次取消重新关注的情况,取最后一次的关注时间(时间戳)


    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public int getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(int subscribe) {
        this.subscribe = subscribe;
    }

    public int getSubscribe_time() {
        return subscribe_time;
    }

    public void setSubscribe_time(int subscribe_time) {
        this.subscribe_time = subscribe_time;
    }
}
