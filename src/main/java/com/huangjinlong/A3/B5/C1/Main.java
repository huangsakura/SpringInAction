package com.huangjinlong.A3.B5.C1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by huang on 2018-05-25-0025.
 */
public class Main {

    public static void main(String[] a) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        A1 a1 = applicationContext.getBean(A1.class);
        System.out.println(a1.getX());
    }
}
