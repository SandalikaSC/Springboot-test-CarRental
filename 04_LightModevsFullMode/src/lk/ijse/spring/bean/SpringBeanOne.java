package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanOne() {
        System.out.println("Spring Bean One Instantiated");
    }
//
//    //light mode
//    @Bean
//    public SpringBeanTwo beanTwo() {
//        return new SpringBeanTwo();
//    }
//
//    @Bean
//    public SpringBeanThree beanThree() {
//        return new SpringBeanThree();
//    }

//    //Light Mode
//    //Interbean Dependencies Not Satisfied
//    s1 and s2 objects are not managed by Context// they are normal objects
    @Bean
    public SpringBeanTwo beanTwo() {
        SpringBeanThree s1 = beanThree();//interbean dependancy
        SpringBeanThree s2 = beanThree();//interbean dependancy
        System.out.println(s1);
        System.out.println(s2);
        return new SpringBeanTwo();
    }

    @Bean
    public SpringBeanThree beanThree() {
        return new SpringBeanThree();
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("Spring Bean One Name Awareness");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring Bean One Factory Awareness");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring Bean One Application Context Awareness");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean One Initializing Bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean One Disposable Bean");
    }


}
