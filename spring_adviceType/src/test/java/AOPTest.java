import com.sun.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring_01
 * @ClassName AOPTest
 * @description:
 * @author: lk
 * @create: 2020-03-27 14:19
 * @Version 1.0
 **/
//测试AOP
public class AOPTest {
    public static void main(String[] args){
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        AccountService service = ac.getBean("accountService", AccountService.class);
        service.saveAccount();
        service.updateAccount();
        service.deleteAccount();
    }
}
