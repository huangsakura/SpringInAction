package com.huangjinlong.A4.B3.C1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] a) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        Bean1 bean1 = applicationContext.getBean(Bean1.class);
        bean1.a();
        System.out.println();
        try {
            bean1.b();
        } catch (Exception e) {

        }
        System.out.println();
        bean1.c();
    }
}
