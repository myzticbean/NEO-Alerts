package com.neoalerts.neodiscoveryservice.properties;

import com.neoalerts.neodiscoveryservice.util.AESEncryption;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "neows.client")
@Slf4j @Getter @Setter
public class NeoWSClientProperties {

    private String apiKey;
    private String decryptedApiKey;

    public String getDecryptedKey() {
        try {
            decryptedApiKey = AESEncryption.decrypt(apiKey);
        } catch (Exception e) {
            log.error("Exception occurred: ", e);
        }
        return decryptedApiKey;
    }

}
