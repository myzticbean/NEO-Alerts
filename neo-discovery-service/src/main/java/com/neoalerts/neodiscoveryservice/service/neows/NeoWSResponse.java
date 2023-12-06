package com.neoalerts.neodiscoveryservice.service.neows;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.neoalerts.neodiscoveryservice.service.neows.dto.Links;
import com.neoalerts.neodiscoveryservice.service.neows.dto.NearEarthObject;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter @Setter @ToString
public class NeoWSResponse {

    private Links links;

    @JsonProperty("element_count")
    private int elementCount;

    @JsonProperty("near_earth_objects")
    private Map<String, List<NearEarthObject>> nearEarthObjects;

}
