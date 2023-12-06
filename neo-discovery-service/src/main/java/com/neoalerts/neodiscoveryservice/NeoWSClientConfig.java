package com.neoalerts.neodiscoveryservice;

import com.neoalerts.neodiscoveryservice.util.AESEncryption;
import lombok.AccessLevel;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "neows.client")
public class NeoWSClientConfig {

    @Getter(AccessLevel.PRIVATE)
    private String apiKey;
    private final String decryptedApiKey;

    public NeoWSClientConfig() {
        try {
            decryptedApiKey = AESEncryption.decrypt(apiKey);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getApiKey() {
        return decryptedApiKey;
    }

}
