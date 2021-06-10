package com.wjz.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.wjz.demo.component.LoginHandleinterceptor;
import com.wjz.demo.component.MyLocaleResolver;
@Configuration
public class MyAppConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		
		//registry.addViewController("/wjz").setViewName("index");
		registry.addViewController("/").setViewName("login");
		registry.addViewController("/index.html").setViewName("login");
		registry.addViewController("/main.html").setViewName("dashboard");
		registry.addViewController("/list.html").setViewName("emp/list");
		
	}
	/**
	 * SpringBoot 2.0,对静态资源访问必须进行拦截 SpringBoot2.0不进行拦截；Spring5.0
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginHandleinterceptor()).addPathPatterns("/**").excludePathPatterns("/","/index.html","/user/login","/webjars/**","/asserts/**");
	}



	@Bean
	public LocaleResolver localeResolver() {
		return new MyLocaleResolver();
	}
}
