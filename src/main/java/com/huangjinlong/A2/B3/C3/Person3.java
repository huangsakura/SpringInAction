package com.huangjinlong.A2.B3.C3;

import org.springframework.context.annotation.Profile;

/**
 * Created by huang on 2018-05-17-0017.
 */
@Profile(value = {})
public class Person3 {

    private Person1 person1;

    public Person3(Person1 person1) {
        this.person1 = person1;
    }

    public Person1 getPerson1() {
        return person1;
    }

    public void setPerson1(Person1 person1) {
        this.person1 = person1;
    }
}
