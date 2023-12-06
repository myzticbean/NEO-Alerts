package com.neoalerts.neodiscoveryservice.service;

import com.neoalerts.neodiscoveryservice.properties.NeoWSClientProperties;
import com.neoalerts.neodiscoveryservice.service.neows.NeoWSClient;
import com.neoalerts.neodiscoveryservice.service.neows.NeoWSResponse;
import com.neoalerts.neodiscoveryservice.service.neows.ResponseHeadersEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NasaAPIService {

    private final NeoWSClient neoWSClient;
    private final NeoWSClientProperties neoWSClientProperties;

    public NasaAPIService(NeoWSClient neoWSClient, NeoWSClientProperties neoWSClientProperties) {
        this.neoWSClient = neoWSClient;
        this.neoWSClientProperties = neoWSClientProperties;
    }

    public void makeNeoWsRequest() {
        log.warn("Making NASA NEO WS API call...");
        ResponseEntity<NeoWSResponse> nearEarthObjectsBasedOnStartAndEndDate = neoWSClient.getNearEarthObjectsBasedOnStartAndEndDate("2023-11-30", "2023-11-30", neoWSClientProperties.getDecryptedKey());
        if(nearEarthObjectsBasedOnStartAndEndDate.getBody() != null)
            log.warn(nearEarthObjectsBasedOnStartAndEndDate.getBody().toString());
        log.warn(nearEarthObjectsBasedOnStartAndEndDate.getHeaders().getFirst(ResponseHeadersEnum.X_RATELIMIT_REMAINING.getHeaderName()));
        log.warn(nearEarthObjectsBasedOnStartAndEndDate.getHeaders().getFirst(ResponseHeadersEnum.X_RATELIMIT_LIMIT.getHeaderName()));
    }

}
