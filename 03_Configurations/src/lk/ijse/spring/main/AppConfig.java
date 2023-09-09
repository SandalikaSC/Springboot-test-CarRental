package lk.ijse.spring.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("lk.ijse.spring.bean")
@Import({AppConfig1.class, AppConfig2.class})// to import annotation configurations
//@ImportResource("classpath:abcd.xml")
//@ImportResource("filepath:absolute-location.xml") xml configuration import
public class AppConfig {


}
