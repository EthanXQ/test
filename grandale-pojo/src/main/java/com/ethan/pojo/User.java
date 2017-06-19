package com.ethan.pojo;

import java.util.Date;

/**
 * Created by Ethan on 2017/4/25.
 */
public class User {

    private long id;          //唯一标识

    private String username;  //用户名  登录 唯一标识

    private String nickname;  //昵称

    private String avatar;    //头像

    private String phone;     //绑定的手机号 可以为空（非手机号或第三方登录时）  登录提示绑定

    private short sex = 0;    //性别

    private Date birthday;    //生日

    private String signature; //签名

    private short level = 0;  //等级  默认0级

    private int growth = 0;   //成长值 默认0

    private Date createTime;  //创建时间

    private short status = 1;  //状态 1.正常


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public short getSex() {
        return sex;
    }

    public void setSex(short sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public short getLevel() {
        return level;
    }

    public void setLevel(short level) {
        this.level = level;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }
}
