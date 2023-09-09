package lk.ijse.spring.main;

import lk.ijse.spring.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {
    @Bean
    public SpringBeanTwo beaTwo() {
        return new SpringBeanTwo();
    }
}
