package mybatis;

import com.ljy.demo.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author admin
 * @Create 2022-02-15 14:18
 * @Desc
 * @Application
 **/
public class ControllerTest {

    @Test
    public void ListTestUsers() {
        ArrayList<Te> list = new ArrayList<>();
        Te te = new Te();
        te.setId(1);
        te.setName("test");
        list.add(te);


        HashMap<String, List<Te>> map = new HashMap<>();
        map.put("List",list);
        System.out.println(map);
    }

}

class Te{
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Te{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

interface Tes{
    List<User> listAll();
}
class Tea implements Tes{
    @Autowired
    TeaDao teaDao;

    @Override
    public List<User> listAll() {
        return teaDao.listAll();
    }
}
interface TeaDao{
    List<User> listAll();
}