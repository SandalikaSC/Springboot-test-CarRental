package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("c1")
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Customer implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public Customer() {
        System.out.println("Customer Instantiated");
    }

    public void saveCustomer() {
        System.out.println("Customer Saved");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name Aware state called");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware state called");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Content Awareness state called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean is ready to use");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean Destroyed");
    }
}
