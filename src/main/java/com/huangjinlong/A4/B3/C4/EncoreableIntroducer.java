package com.huangjinlong.A4.B3.C4;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by huang on 2018-05-29-0029.
 */
@Aspect
@Component
public class EncoreableIntroducer {

    @DeclareParents(value = "com.huangjinlong.A4.B3.C4.Performance+",defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
