package com.huangjinlong.A5.B1.C2.initializer;

import com.huangjinlong.A5.B1.C2.config.RootConfig;
import com.huangjinlong.A5.B1.C2.config.ServletConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

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

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {

        MultipartConfigElement multipartConfigElement = new MultipartConfigElement("/upload");
        registration.setMultipartConfig(multipartConfigElement);
    }
}
