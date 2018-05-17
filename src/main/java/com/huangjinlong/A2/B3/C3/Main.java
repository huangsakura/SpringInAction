package com.huangjinlong.A2.B3.C3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by huang on 2018-05-17-0017.
 */
public class Main {

    public static void main(String[] a) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        Person1 person1 = applicationContext.getBean(Person1.class);
        System.out.println(person1.hashCode());
        Person2 person2 = applicationContext.getBean(Person2.class);
        System.out.println(person2.getPerson1().hashCode());
        Person3 person3 = applicationContext.getBean(Person3.class);
        System.out.println(person3.getPerson1().hashCode());
    }
}
