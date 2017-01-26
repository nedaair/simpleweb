import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

/**
 * Created by nedaair on 2017-01-26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class H2Test {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test(){
        List<Map<String, Object>> userList = jdbcTemplate.queryForList("select * from board");

        for(Map<String, Object> user : userList){
            System.out.println(user.get("title"));
        }
    }


}
