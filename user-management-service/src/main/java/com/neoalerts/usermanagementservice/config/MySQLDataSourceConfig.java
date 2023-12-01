package com.neoalerts.usermanagementservice.config;

import com.neoalerts.usermanagementservice.util.AESEncryption;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Configuration
public class MySQLDataSourceConfig {

    @Value("${mysql.datasource.url}")
    private String url;

    @Value("${mysql.datasource.username}")
    private String username;

    @Value("${mysql.datasource.password}")
    private String password;

    @Value("${mysql.datasource.driver-class-name}")
    private String driverClassName;

    @Value("${mysql.jpa.hibernate.ddl-auto}")
    private String hibernateDDLAuto;

    @Value("${mysql.jpa.show-sql}")
    private String showSql;

    @Bean
    public DataSource dataSource() throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(AESEncryption.decrypt(password));
        dataSource.setDriverClassName(driverClassName);
        dataSource.setConnectionProperties(getConProperties());

        return dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder, DataSource dataSource) {
        // Example configuration, adjust as needed
        LocalContainerEntityManagerFactoryBean factory = builder
                .dataSource(dataSource)
                .packages("com.neoalerts.usermanagementservice.service.dao") // Set your entity package
                .persistenceUnit("default")
                .properties(getJpaProperties()) // Set JPA properties
                .build();

        // Configure JpaVendorAdapter and other settings if needed

        return factory;
    }

    private Properties getConProperties() {
        Properties properties = new Properties();
        properties.put("type", "com.zaxxer.hikari.HikariDataSource");
        properties.put("hikari.maximumPoolSize", 10);
        return properties;
    }

    private Map<String, ?> getJpaProperties() {
        Map<String, String> propertiesMap = new HashMap<>();
        propertiesMap.put("hibernate.show_sql", String.valueOf(showSql));
        propertiesMap.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        propertiesMap.put("hibernate.ddl-auto", hibernateDDLAuto);
        return propertiesMap;
    }

}
