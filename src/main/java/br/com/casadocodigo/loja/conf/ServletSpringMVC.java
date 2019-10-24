package br.com.casadocodigo.loja.conf;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	protected Class<?>[] getRootConfigClasses() {
		return new Class[0];
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
	    return new Class[] {AppWebConfiguration.class, JPAConfiguration.class};
	}
	
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
	
	@Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        encodingFilter.setEncoding("UTF-8");
        return new Filter[] {encodingFilter};
    }
}
