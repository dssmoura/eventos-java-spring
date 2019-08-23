package com.eventosapp;

import java.net.URISyntaxException;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfiguration {

	@Bean
    public BasicDataSource dataSource() throws URISyntaxException {
        String username = "root";
        String password = "root";
        String dbUrl = "jdbc:postgresql://127.0.0.1:5432/db001";

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(dbUrl);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);

        return basicDataSource;
    }
	


}
