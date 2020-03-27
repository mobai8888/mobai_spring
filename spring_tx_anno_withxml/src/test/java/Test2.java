import com.sun.config.SpringTxConfiguration;
import com.sun.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: spring_01
 * @ClassName Test
 * @description:
 * @author: lk
 * @create: 2020-03-28 03:37
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringTxConfiguration.class)
public class Test2 {
    @Autowired
    private AccountService as;

    @Test
    public  void testTransfer(){
        as.transfer("aaa","bbb",100f);

    }
}
