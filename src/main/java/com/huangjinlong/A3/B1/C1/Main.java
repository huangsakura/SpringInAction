package com.huangjinlong.A3.B1.C1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;

/**
 * Created by huang on 2018-05-24-0024.
 */
public class Main {

    public static void main(String[] a) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProfileConfig.class);

        Test1 test1 = applicationContext.getBean(Test1.class);
        test1.a();
    }
}
