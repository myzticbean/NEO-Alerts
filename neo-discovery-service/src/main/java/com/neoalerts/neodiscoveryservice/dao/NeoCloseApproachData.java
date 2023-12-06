package com.neoalerts.neodiscoveryservice.dao;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.util.Date;

@UserDefinedType(value = "neo_close_approach_data")
@Data
public class NeoCloseApproachData {

    private Date closeApproachDate;

    private Double relativeVelocityInKmps;

    private Double relativeVelocityInKmph;

    private Double relativeVelocityInMph;

    private String orbitingBody;

}
