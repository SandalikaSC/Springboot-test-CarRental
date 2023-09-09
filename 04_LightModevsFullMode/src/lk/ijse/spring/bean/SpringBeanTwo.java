package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//@Component
public class SpringBeanTwo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanTwo() {
        System.out.println("Spring Bean Two Instantiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Spring Bean Two Name Awareness");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring Bean Two Factory Awareness");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring Bean Two Application Context Awareness");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean Two Initializing Bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean Two Disposable Bean");
    }
}
