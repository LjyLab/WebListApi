package com.ljy.demo.domain;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author admin
 * @Create 2022-02-13 20:48
 * @Desc
 * @Application
 **/
public class Dept {
    private Integer id;
    private Integer uid;
    private String deptname;

    public Dept() {
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", uid=" + uid +
                ", deptname='" + deptname + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public Dept(Integer id, Integer uid, String deptname) {
        this.id = id;
        this.uid = uid;
        this.deptname = deptname;
    }
}
