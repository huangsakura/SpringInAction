package com.huangjinlong.A5.B1.C2.initializer;

import com.huangjinlong.A5.B1.C2.config.RootConfig;
import com.huangjinlong.A5.B1.C2.config.ServletConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by huang on 2018-05-29-0029.
 */
public class CustomWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {RootConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {ServletConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
