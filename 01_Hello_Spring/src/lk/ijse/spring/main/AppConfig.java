package lk.ijse.spring.main;

import lk.ijse.spring.bean.Customer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration// a source for bean definition
//@ComponentScan(basePackages = "lk.ijse.spring.bean")
@ComponentScan(basePackageClasses = Customer.class)
public class AppConfig {

    //another method of registering a bean to the Application Context
//    @Bean("fid")
//    public FakeConnection setConnection(){
//        return new FakeConnection();
//    }


}
