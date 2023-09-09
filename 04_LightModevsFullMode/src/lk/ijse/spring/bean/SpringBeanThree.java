package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//@Component
public class SpringBeanThree implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanThree() {
        System.out.println("Spring Bean Three Instantiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Spring Bean Three Name Awareness");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring Bean Three Factory Awareness");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring Bean Three Application Context Awareness");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean Three Initializing Bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean Three Disposable Bean");
    }
}
