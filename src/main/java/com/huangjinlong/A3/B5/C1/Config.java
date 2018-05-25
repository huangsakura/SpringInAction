package com.huangjinlong.A3.B5.C1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by huang on 2018-05-25-0025.
 */
@PropertySource(value = {"classpath:app.properties"})
public class Config {

    /*
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
    */

    @Autowired
    private Environment environment;
    @Value("${huang.x}")
    private String t_x;
    @Value("#{T(System).currentTimeMillis()}")
    private String time;
    @Value("#{systemProperties['huang.x']}")
    private String t_x1;

    @Bean
    public A1 a1() {
        A1 a1 = new A1();
        a1.setX(t_x);
        System.out.println(time);
        System.out.println(t_x1);
        return a1;
    }
}
