package lk.ijse.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpringBeanTwo implements InitializingBean {

    //runtime value injection can be use for properties also
    @Value("C001")
    private String id;
    @Value("IJSE")
    private String name;


    public SpringBeanTwo() {
        System.out.println("Spring Bean Two Instantiated");
        System.out.println(id);// not populated yet
        System.out.println(name);//not populated yet
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(id); //ready
        System.out.println(name); //ready
    }

    //instantiated
    //populate properties
    //initializing Bean
}
