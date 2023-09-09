package lk.ijse.spring.main;

import lk.ijse.spring.bean.SpringBeanThree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
    @Bean
    public SpringBeanThree beanThree(){
        return new SpringBeanThree();
    }
}
