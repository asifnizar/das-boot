package com.boot.config;

import javax.activation.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PersistanceConfiguration {
	@Bean
	@ConfigurationProperties(prefix="spring.datasource")
	@Primary
	public javax.sql.DataSource datasource() {
		return DataSourceBuilder.create().build();
	}
}