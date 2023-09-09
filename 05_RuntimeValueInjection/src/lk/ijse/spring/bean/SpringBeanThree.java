package lk.ijse.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpringBeanThree implements InitializingBean {

    //property place holder ${}
    //Spring Enviorenment

    @Value("${LOGNAME}")//System.getEnv
    private String id;

    @Value("${java.runtime.name}") //System.getProperties
    private String javaName;


    @Value("${user.name.ijse}")
    private String ijseName;

    @Value("${a.user.name}")
    private String secondResource;

    public SpringBeanThree() {
        System.out.println("Spring Bean Three Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(id);
        System.out.println(javaName);
        System.out.println(ijseName);
        System.out.println(secondResource);
    }
}
