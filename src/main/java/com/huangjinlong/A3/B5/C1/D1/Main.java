package com.huangjinlong.A3.B5.C1.D1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] a) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        Bean2 bean2 = applicationContext.getBean(Bean2.class);
        System.out.println(bean2.getY());
        System.out.println(bean2.getPai2());

        Bean1 bean1 = applicationContext.getBean(Bean1.class);
        System.out.println(bean1.getY());
    }
}
