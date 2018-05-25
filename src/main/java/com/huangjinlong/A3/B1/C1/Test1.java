package com.huangjinlong.A3.B1.C1;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by huang on 2018-05-24-0024.
 */
public class Test1 {

    @Autowired
    private TestInterface testInterface;

    public void a() {
        testInterface.getName();
    }
}
