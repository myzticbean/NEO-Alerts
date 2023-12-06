package com.neoalerts.neodiscoveryservice.service.neows;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "neows-client", url = "https://api.nasa.gov/neo/rest/v1/feed")
public interface NeoWSClient {

    @GetMapping("?start_date={startDate}&end_date={endDate}&api_key={apiKey}")
    String getNearEarthObjectsBasedOnStartAndEndDate(
            @PathVariable String startDate,
            @PathVariable String endDate,
            @PathVariable String apiKey);

}
