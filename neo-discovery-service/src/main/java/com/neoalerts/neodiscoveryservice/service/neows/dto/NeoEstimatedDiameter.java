package com.neoalerts.neodiscoveryservice.service.neows.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class NeoEstimatedDiameter {

    private Long neoReferenceId;

    private Double kilometerEstDiameterMin;

    private Double kilometerEstDiameterMax;

    private Double meterEstDiameterMin;

    private Double meterEstDiameterMax;

    private Double mileEstDiameterMin;

    private Double mileEstDiameterMax;

    private Double feetEstDiameterMin;

    private Double feetEstDiameterMax;

}
