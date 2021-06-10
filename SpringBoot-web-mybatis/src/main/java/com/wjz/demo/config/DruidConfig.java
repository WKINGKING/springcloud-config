package com.wjz.demo.config;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configuration
public class DruidConfig {
	@ConfigurationProperties(prefix = "spring.datasource")
	@Bean
	public DataSource druid() {
		return new DruidDataSource();
	}
	//配置Druid的监控
	//1、配置后台的管理servlet
	@Bean
	public ServletRegistrationBean<StatViewServlet> statViewServlet(){
		 ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<StatViewServlet>(new StatViewServlet(),"/druid/*");
		 HashMap<String, String> initParameters = new HashMap<String,String>();
		 initParameters.put("loginUsername", "admin");
		 initParameters.put("loginPassword", "123456");
		 initParameters.put("allow", "");
		 bean.setInitParameters(initParameters);
		 return bean;
	}
	//2、配置一个监控的filter
	@Bean
	public FilterRegistrationBean<WebStatFilter> webStatFilter(){
		FilterRegistrationBean<WebStatFilter> bean = new FilterRegistrationBean<WebStatFilter>();
		bean.setFilter(new WebStatFilter());
		HashMap<String, String> initParameters = new HashMap<String,String>();
		initParameters.put("exclusions", "*.js,*.css");
		bean.setInitParameters(initParameters);
		bean.addUrlPatterns("/*");
		return bean;
	}
}
