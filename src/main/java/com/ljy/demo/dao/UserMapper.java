package com.ljy.demo.dao;

import java.util.List;

import com.ljy.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    /*
     * @Description: 显示所有用户关联职务
     * @Author: LjyLab
     * @Date: 2022/2/14 13:46
     **/
    List<User> getUserByList();

    /** 查找所有用户 */
    List<User> listAll();
    
    /** 添加用户 */
    Integer insert(User user);
    
    /** 根据id删除用户 */
    Integer deleteById(Integer id);
    
    /** 更新用户 */
    Integer update(User user);
    
    /** 根据id查找用户 */
    User getById(Integer id);
}
