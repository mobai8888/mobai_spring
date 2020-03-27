import com.sun.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: spring_01
 * @ClassName AccountServiceTest
 * @description:
 * @author: lk
 * @create: 2020-03-28 01:41
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AccountServiceTest {
    @Autowired
    private AccountService tservice;
    @Test
    public void testTransfer(){
        tservice.transfer("aaa","bbb",500f);
    }

}
