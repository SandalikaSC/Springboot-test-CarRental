package lk.ijse.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanFour implements InitializingBean {

    @Autowired
    Environment env;//can accsess the spring environment

    public SpringBeanFour() {
        System.out.println("Spring Bean Four Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //genarate exception if the key is wrong
        String logname = env.getRequiredProperty("LOGNAME");
        //generate null if the key is wrong
        String javaName = env.getProperty("java.runtime.name");
        String resourceBundle = env.getProperty("user.name.ijse");
        System.out.println(logname);
        System.out.println(javaName);
        System.out.println(resourceBundle);
    }
}
