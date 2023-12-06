package com.neoalerts.neodiscoveryservice.dao;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@UserDefinedType(value = "neo_estimated_diameter")
@Data
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
