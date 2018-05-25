package com.huangjinlong.A3.B1.C1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by huang on 2018-05-24-0024.
 */
@PropertySource(value = {"classpath:app.properties"})
public class ProfileConfig {

    @Bean
    @Profile(value = {"dev1"})
    //@Primary
    public TestInterface test2() {
        return new TestInterface2();
    }

    @Bean
    @Profile(value = {"dev"})
    public TestInterface test1() {
        return new TestInterface1();
    }



    @Bean
    public Test1 test11() {
        return new Test1();
    }
}
