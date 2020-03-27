import com.sun.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: spring_01
 * @ClassName AOPTest
 * @description:
 * @author: lk
 * @create: 2020-03-27 14:19
 * @Version 1.0
 **/
//测试AOP
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AOPTest {

    @Autowired
    private AccountService service;
    //前置通知
    @Test
    public void testBefore(){
            service.saveAccount();
    }
    //后置(成功)通知
    @Test
    public void testAfterRun(){
        service.saveAccount();
    }
    //异常通知
    @Test
    public void testExption(){
        service.saveAccount();
    }
    //最终通知
    @Test
    public void testFinally(){
        service.saveAccount();
    }
    //怀绕通知
    @Test
    public void testArround(){
            service.saveAccount();
    }

}
