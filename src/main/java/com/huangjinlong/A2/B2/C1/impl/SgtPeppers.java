package com.huangjinlong.A2.B2.C1.impl;

import com.huangjinlong.A2.B2.C1.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * Created by huang on 2018-05-17-0017.
 */
@Component(value = "sgtPeppers")
public class SgtPeppers implements CompactDisc {
    public void play() {
        System.out.println("播放SgtPeppers");
    }
}
