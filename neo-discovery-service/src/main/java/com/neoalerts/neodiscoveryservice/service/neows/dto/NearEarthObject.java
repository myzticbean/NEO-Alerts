package com.neoalerts.neodiscoveryservice.service.neows.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter @Setter @ToString
public class NearEarthObject {

    @JsonProperty("links")
    private NeoLink links;

    @JsonProperty("id")
    private String id;

    @JsonProperty("neo_reference_id")
    private String neoReferenceId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("nasa_jpl_url")
    private String nasaJplUrl;

    @JsonProperty("absolute_magnitude_h")
    private Double absoluteMagnitudeH;

    @JsonProperty("estimated_diameter")
    private EstimatedDiameter estimatedDiameter;

    @JsonProperty("is_potentially_hazardous_asteroid")
    private Boolean isPotentiallyHazardousAsteroid;

    @JsonProperty("close_approach_data")
    private List<CloseApproachData> closeApproachData;

    @JsonProperty("is_sentry_object")
    private Boolean isSentryObject;
}
