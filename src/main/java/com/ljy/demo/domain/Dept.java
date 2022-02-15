package com.ljy.demo.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author admin
 * @Create 2022-02-13 20:48
 * @Desc
 * @Application
 **/
@Data
public class Dept {
    private Integer id;
    private Integer uid;
    private String deptname;
}
