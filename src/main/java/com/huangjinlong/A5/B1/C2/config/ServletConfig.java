package com.huangjinlong.A5.B1.C2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

/**
 * Created by huang on 2018-05-29-0029.
 */
@Configuration
@ComponentScan(basePackages = {"com.huangjinlong.A5.B1.C2"})
public class ServletConfig {

    @Bean
    public MultipartResolver multipartResolver() {
        return new StandardServletMultipartResolver();
    }
}
