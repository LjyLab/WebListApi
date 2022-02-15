package com.ljy.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;
    
    private String account;
    
    private String password;
    
    private String name;
    
    private String info;

    private Integer deptid;

    /**
     * @Description: 16位时间转换
     * @DateTimeFormat(pattern = "yyyy-MM-dd")
     **/
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Dept dep;

}
