package com.neoalerts.neodiscoveryservice.service.neows.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter @Setter @ToString
public class NeoCloseApproachData {

    private Date closeApproachDate;

    private Double relativeVelocityInKmps;

    private Double relativeVelocityInKmph;

    private Double relativeVelocityInMph;

    private String orbitingBody;

}
