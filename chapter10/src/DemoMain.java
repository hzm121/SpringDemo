import com.hzm.springdemo.pojo.ComPlexAssembly;
import com.hzm.springdemo.pojo.Role;
import com.hzm.springdemo.pojo.User;
import com.hzm.springdemo.pojo.UserRoleAssembly;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class DemoMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
//        Role role = (Role) classPathXmlApplicationContext.getBean("role");
//        System.out.println(role.getRoleName()+"---"+role.getNote());
//        ComPlexAssembly complexAssesmbly = (ComPlexAssembly)classPathXmlApplicationContext.getBean("complexAssembly");
//        Map<String, String> map1 = complexAssesmbly.getMap();
//        for (Map.Entry<String, String> set :map1.entrySet()
//                ) {
//            System.out.println(set.getKey()+"---"+set.getValue());
//        }
        UserRoleAssembly userRoleAssemble = (UserRoleAssembly)classPathXmlApplicationContext.getBean("userRoleAssemble");
        Map<Role, User> map = userRoleAssemble.getMap();
        map.forEach((role,user)->{
            System.out.println(role.getRoleName()+"---"+user.getUserName());
        });
    }
}
