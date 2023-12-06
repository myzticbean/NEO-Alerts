package com.neoalerts.neodiscoveryservice;

import com.neoalerts.neodiscoveryservice.properties.DataStaxAstraProperties;
import com.neoalerts.neodiscoveryservice.properties.SpringCassandraProperties;
import com.neoalerts.neodiscoveryservice.util.AESEncryption;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.nio.file.Path;

@SpringBootApplication
@EnableConfigurationProperties({DataStaxAstraProperties.class, SpringCassandraProperties.class, NeoWSClientConfig.class})
@EnableFeignClients
@Slf4j
public class NeoDiscoveryServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(NeoDiscoveryServiceApplication.class, args);
    }

    /**
     * Initializes the Cassandra DB
     * @param astraProperties Astra properties
     * @param cassandraProperties Cassandra properties
     * @return CqlSessionBuilderCustomizer
     */
    @Bean
    public CqlSessionBuilderCustomizer sessionBuilderCustomizer(DataStaxAstraProperties astraProperties, SpringCassandraProperties cassandraProperties) {
        Path bundle = astraProperties.getSecureConnectBundle().toPath();
        log.warn(bundle.getFileName() + " " + bundle.getFileSystem().getFileStores().toString());
        return cqlSessionBuilder -> {
            try {
                cqlSessionBuilder.withCloudSecureConnectBundle(bundle)
                        .withAuthCredentials(
                                AESEncryption.decrypt(cassandraProperties.getUsername()),
                                AESEncryption.decrypt(cassandraProperties.getPassword()));
            } catch (Exception e) {
                log.error("Exception occurred: ", e);
            }
        };
    }

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     */
    @Override
    public void run(String... args) {
        log.warn("Server is up!");
    }
}
