package com.huangjinlong.A4.B3.C1;

import org.springframework.stereotype.Component;

@Component
public class Bean1 {

    public void a() {
        System.out.println("表演中");
    }

    public void b() throws Exception {
        System.out.println("表演中");
        throw new Exception();
    }

    public void c() {
        System.out.println("表演中");
    }


    public void d(int a) {
        System.out.println("d方法"+a);
    }
}
