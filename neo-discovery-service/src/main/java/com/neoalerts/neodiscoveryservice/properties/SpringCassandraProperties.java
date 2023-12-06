package com.neoalerts.neodiscoveryservice.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.cassandra.config.SchemaAction;

import java.time.Duration;

@ConfigurationProperties(prefix = "spring.cassandra")
@EnableConfigurationProperties
@Getter
@Setter
public class SpringCassandraProperties {

    private String keyspaceName;
    private String username;
    private String password;
    private SchemaAction schemaAction;
    private Duration requestTimeout;
    private Duration connectTimeout;
    private Duration initQueryTimeout;

}
