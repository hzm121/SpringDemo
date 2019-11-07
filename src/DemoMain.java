import com.hzm.springdemo.pojo.JuiceMaker2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-copnfig.xml");
        JuiceMaker2 juiceMake2 = (JuiceMaker2) applicationContext.getBean("juiceMaker2");
        String s = juiceMake2.makeJuice2();
        System.out.println(s);
    }
}

