package com.huangjinlong.A1.B2.C1;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by huang on 2018-05-16-0016.
 */
public class TestListener1 implements ApplicationListener {
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("接收到消息1:"+event.getSource().toString());
    }
}
