package com.gdw888.springsecurity.demo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] classes = new Class[1];
		classes[0] = DemoAppConfig.class;
		
		return classes;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
}
