package com.huangjinlong.A4.B3.C4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by huang on 2018-05-29-0029.
 */
public class Main {

    public static void main(String[] a) {
        //AnnotationConfigWebApplicationContext
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        Performance performance = applicationContext.getBean(Performance.class);
        performance.perform();
        Encoreable encoreable = (Encoreable)performance;
        encoreable.performEncore();
    }
}
