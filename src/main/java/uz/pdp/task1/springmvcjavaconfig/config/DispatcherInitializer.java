package uz.pdp.task1.springmvcjavaconfig.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() { // root web application context shu yerda bajariladi
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() { // servlet web application context shu yerda bajariladi
        return new Class[]{WebMvcConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() { // kerakli control larga requestni uzatish
        return new String[]{"/"};
    }
}
