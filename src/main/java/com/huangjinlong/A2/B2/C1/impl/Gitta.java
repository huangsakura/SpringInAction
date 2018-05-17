package com.huangjinlong.A2.B2.C1.impl;

import com.huangjinlong.A2.B2.C1.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * Created by huang on 2018-05-17-0017.
 */
@Component(value = "gitta")
public class Gitta implements CompactDisc {
    public void play() {
        System.out.println("播放Gitta");
    }
}
