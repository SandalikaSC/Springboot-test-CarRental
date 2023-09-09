package lk.ijse.spring.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.bean")
//can be repeatable because of repeatable annotation
@PropertySource("classpath:application.properties")//import resource bundle to spring environment
@PropertySource("classpath:dev.properties")
public class AppConfig {
//    @Bean
//    public String string(){
//        return "Hello There";
//    }
}
