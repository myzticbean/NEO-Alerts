package com.neoalerts.neodiscoveryservice.service.neows.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Measurement {
    @JsonProperty("estimated_diameter_min")
    private double min;

    @JsonProperty("estimated_diameter_max")
    private double max;
}
