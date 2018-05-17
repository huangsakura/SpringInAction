package com.huangjinlong.A2.B3.C3;

import org.springframework.context.annotation.Bean;

/**
 * Created by huang on 2018-05-17-0017.
 */
public class Config {

    @Bean
    public Person2 person2() {
        Person1 person1 = person1();
        System.out.println(person1.hashCode());
        return new Person2(person1);
    }

    @Bean
    public Person3 person3(Person1 person1) {
        return new Person3(person1);
    }

    @Bean
    public Person1 person1() {
        Person1 person1 = new Person1();
        System.out.println(person1.hashCode());
        return person1;
    }
}
