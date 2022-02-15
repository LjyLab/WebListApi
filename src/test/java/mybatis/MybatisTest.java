package mybatis;

import com.ljy.demo.dao.UserMapper;
import com.ljy.demo.domain.User;
import com.ljy.demo.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MybatisTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.listAll();
        for (User user : users) {
            System.out.println(user);
        }
//        System.out.println(users);

        sqlSession.close();

    }

    @Test
    public void getAllUsers() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUserByList();
        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.getById(1);
        sqlSession.close();
    }

    public void getDeptName(){

    }


}
