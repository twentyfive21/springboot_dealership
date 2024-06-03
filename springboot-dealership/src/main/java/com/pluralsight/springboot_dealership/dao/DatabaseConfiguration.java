package com.pluralsight.springboot_dealership.dao;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
public class DatabaseConfiguration {

    private final BasicDataSource basicDataSource;

    @Autowired
    public DatabaseConfiguration (
            @Value("${url}") String url,
            @Value("${username}") String username,
            @Value("${password}") String password) {
        basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(url);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);
    }

    @Bean
    public DataSource dataSource() {
        return basicDataSource;
    }
}
