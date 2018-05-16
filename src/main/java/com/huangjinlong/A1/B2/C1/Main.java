package com.huangjinlong.A1.B2.C1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by huang on 2018-05-16-0016.
 */
public class Main {

    public static void main(String[] a) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestConfig.class);

        Test test = applicationContext.getBean(Test.class);
        test.print();
        test.sendMessage("你好啊");
    }
}
