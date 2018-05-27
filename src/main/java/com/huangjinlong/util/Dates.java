package com.huangjinlong.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

    private Dates(){}

    private static final String CUSTOM_TIME_PATTERN_1 = "yyyy-MM-dd HH:mm:ss";
    private static final String CUSTOM_TIME_PATTERN_2 = "yyyy-MM-dd HH:mm:ss.SSS";

    public enum CustomPattern {
        CUSTOM_TIME_PATTERN_1,
        CUSTOM_TIME_PATTERN_2
    }


    private static final SimpleDateFormat simpleDateFormat_1 = new SimpleDateFormat(CUSTOM_TIME_PATTERN_1);
    private static final SimpleDateFormat simpleDateFormat_2 = new SimpleDateFormat(CUSTOM_TIME_PATTERN_2);

    public static String format(Date date, CustomPattern customPattern) {
        switch (customPattern) {
            case CUSTOM_TIME_PATTERN_1:{
                return simpleDateFormat_1.format(date);
            } case CUSTOM_TIME_PATTERN_2:{
                return simpleDateFormat_2.format(date);
            } default:{
                return null;
            }
        }
    }
}
