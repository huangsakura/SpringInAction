package com.huangjinlong.A2.B2.C1;

import com.huangjinlong.A2.B2.C1.impl.SgtPeppers;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by huang on 2018-05-17-0017.
 */
public class Main {

    public static void main(String[] a) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CDPlayerConfig.class);

        SgtPeppers sgtPeppers = applicationContext.getBean(SgtPeppers.class);
        sgtPeppers.play();
    }
}
