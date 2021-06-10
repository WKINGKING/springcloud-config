package com.wjz.demo.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class MyBatisConfig {
	@Bean
	public ConfigurationCustomizer configurationCustomizer() {
		return new ConfigurationCustomizer() {
			
			@Override
			public void customize(Configuration configuration) {
				//设置驼峰命名法的映射_n N
				configuration.setMapUnderscoreToCamelCase(true);
			}
		};
	}
}
