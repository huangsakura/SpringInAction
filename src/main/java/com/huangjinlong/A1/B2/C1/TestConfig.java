package com.huangjinlong.A1.B2.C1;

import org.springframework.context.annotation.Bean;

/**
 * Created by huang on 2018-05-16-0016.
 */
public class TestConfig {

    @Bean
    public Test newTest() {
        Test test = new Test();
        test.setX(2);
        return test;
    }

    @Bean
    public Test1 newTest1() {
        return new Test1();
    }

    @Bean
    public TestListener newTestListener() {
        return new TestListener();
    }

    //@Bean
    public TestListener1 newTestListener1() {
        return new TestListener1();
    }
}
