package com.huangjinlong.A5.B1.C2.initializer;

import com.huangjinlong.A5.B1.C2.filter.MyFilter;
import com.huangjinlong.A5.B1.C2.servlet.MyServlet;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class MyServletInitializer implements WebApplicationInitializer {
    public void onStartup(ServletContext servletContext) throws ServletException {
        ServletRegistration.Dynamic dynamic = servletContext.addServlet("myServlet",MyServlet.class);
        dynamic.addMapping("/web/**");

        javax.servlet.FilterRegistration.Dynamic filterRegistrationDynamic
                = servletContext.addFilter("myFilter",MyFilter.class);
        filterRegistrationDynamic.addMappingForUrlPatterns(null,false,"");
    }
}
