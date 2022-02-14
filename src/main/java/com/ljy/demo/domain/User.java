package com.ljy.demo.domain;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class User {
    @Autowired
    Dept dept;

    private Integer id;
    
    private String account;
    
    private String password;
    
    private String name;
    
    private String info;

    private Integer deptid;
    
    private Date createTime;
    
    private Date updateTime;

    private Dept dep;


    public Dept getDep() {
        return dep;
    }

    public void setDep(Dept dep) {
        this.dep = dep;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", deptid=" + deptid +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", dep=" + dep +
                '}';
    }
}
