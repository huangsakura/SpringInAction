package com.huangjinlong.A4.B3.C1;

import com.huangjinlong.util.Dates;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import java.util.Date;

@Aspect
@Component
public class Aspect1 {

    /**
     * 表达式语法 https://blog.csdn.net/qq525099302/article/details/53996344
     */
    //@Pointcut("execution(* com.huangjinlong.A4.B3.C1.*.*(..))")
    @Pointcut("execution(* com.huangjinlong.A4.B3.C1.Bean1.a(..)) || execution(* com.huangjinlong.A4.B3.C1.Bean1.b(..))")
    public void pointCut() {
        System.out.println("pointCut");
    }

    //@Order(2)
    /*
    @Before("pointCut()")
    public void before1() {
        System.out.println("konnnijiha");
    }
    */

    //@Order(1)
    @Before("pointCut()")
    public void before2() {
        //System.out.println("坐座位");
        System.out.println("进入方法的时间:"+ Dates.format(new Date(),Dates.CustomPattern.CUSTOM_TIME_PATTERN_2));
    }

    @AfterReturning("pointCut()")
    public void afterReturn() {
        //System.out.println("鼓掌");
        System.out.println("退出方法的时间:"+ Dates.format(new Date(),Dates.CustomPattern.CUSTOM_TIME_PATTERN_2));
    }

    @AfterThrowing("pointCut()")
    public void emegency() {
        System.out.println("退票");
    }

    @Pointcut("execution(* com.huangjinlong.A4.B3.C1.Bean1.c(..))")
    public void pointCut1() {
        System.out.println("pointCut");
    }

    @Around("pointCut1()")
    public void watching(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("进入方法的时间:"+ Dates.format(new Date(),Dates.CustomPattern.CUSTOM_TIME_PATTERN_2));
        try {
            //proceedingJoinPoint.proceed();
        } catch (Throwable e) {

        }
        System.out.println("退出方法的时间:"+ Dates.format(new Date(),Dates.CustomPattern.CUSTOM_TIME_PATTERN_2));
    }

    @Pointcut("execution(* com.huangjinlong.A4.B3.C1.Bean1.d(int)) && args(x)")
    public void pointCut2(int x) {}

    @Before("pointCut2(y)")
    public void x(int y) {
        System.out.println(y);
    }
}
