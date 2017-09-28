package com.xinyi.rent.model;

import javax.persistence.*;

/**
 * Created by wxy on 2017/9/27.
 *
 */

@Entity
@Table(name = "user")
public class UserModel {
    //男
    public final static int USER_SEX_MALE = 1;
    //女
    public final static int USER_SEX_GIRL = 0;

    //微信
    public final static int USER_TYPE_WEIXIN = 1;
    //微博
    public final static int USER_TYPE_WEIBO = 2;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "phoneNumber")
    private String phoneNumber;//电话号码

    @Column(name="balance")
    private double balance;//余额

    private String password;//密码 md5加密

    @Column(name = "nickname")
    private String nickname;//别名

    private int gender;//性别

    @Column(name = "idNumber")
    private String idNumber;//身份证

    private String name;//身份证上的姓名

    @Column(name = "idPhoto1")
    private String idPhoto1;//身份证正面照片

    @Column(name = "idPhoto2")
    private String idPhoto2;//身份证反面照片

    @Column(name = "payPassword")
    private String payPassword;//支付密码 6位

    @Column(name = "registerTime")
    private Long registerTime;//注册时间  服务器自动生成

    @Column(name = "lastTime")
    private Long lastTime;//上次登录时间

    @Column(name = "orderId")
    private Long orderId;//用户对应的订单id  1：N

    @Column(name = "addressId")
    private Long addressId;//用户地址id  1：N

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdPhoto1() {
        return idPhoto1;
    }

    public void setIdPhoto1(String idPhoto1) {
        this.idPhoto1 = idPhoto1;
    }

    public String getIdPhoto2() {
        return idPhoto2;
    }

    public void setIdPhoto2(String idPhoto2) {
        this.idPhoto2 = idPhoto2;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public Long getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Long registerTime) {
        this.registerTime = registerTime;
    }

    public Long getLastTime() {
        return lastTime;
    }

    public void setLastTime(Long lastTime) {
        this.lastTime = lastTime;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }
}
