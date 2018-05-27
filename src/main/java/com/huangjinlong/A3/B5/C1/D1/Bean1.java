package com.huangjinlong.A3.B5.C1.D1;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Bean1 {

    @Value("${huang.x}")
    private String x;

    @Value("#{ systemProperties['java.version'] }")
    private String y;
}
