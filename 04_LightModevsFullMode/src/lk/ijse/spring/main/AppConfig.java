package lk.ijse.spring.main;

import lk.ijse.spring.bean.SpringBeanThree;
import lk.ijse.spring.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.bean")
public class AppConfig {

    //Full Mode
    //satisfied interbean-dependencies
//    @Bean
//    public SpringBeanTwo beanTwo(){
//        SpringBeanThree s1 = beanThree();//interbean dependancy
//        SpringBeanThree s2 = beanThree();//interbean dependancy
//        System.out.println(s1);
//        System.out.println(s2);
//        return new SpringBeanTwo();
//    }
//
//    @Bean
//    public SpringBeanThree beanThree(){
//        return new SpringBeanThree();
//    }

}
