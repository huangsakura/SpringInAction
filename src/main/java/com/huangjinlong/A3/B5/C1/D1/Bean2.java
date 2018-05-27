package com.huangjinlong.A3.B5.C1.D1;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Bean2 {

    @Value("#{bean1.x}")
    private String y;

    @Value("#{T(java.lang.Math).PI * 2}")
    private String pai2;
}
