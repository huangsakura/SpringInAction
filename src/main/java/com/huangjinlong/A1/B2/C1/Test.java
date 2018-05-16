package com.huangjinlong.A1.B2.C1;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by huang on 2018-05-16-0016.
 */
@Data
public class Test implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean {

    private int x;

    private ApplicationContext applicationContext;

    public void print() {
        System.out.println("111111111111");
    }

    public void setBeanName(String s) {
        System.out.println(s);
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void sendMessage(String message) {
        applicationContext.publishEvent(new TestEvent(message));
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Test的afterPropertiesSet");
        System.out.println(applicationContext.getBean(Test1.class));
    }
}
