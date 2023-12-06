package com.neoalerts.neodiscoveryservice.service.neows.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class EstimatedDiameter {
    private Measurement kilometers;
    private Measurement meters;
    private Measurement miles;
    private Measurement feet;
}
