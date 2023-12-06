package com.neoalerts.neodiscoveryservice.service.dao;

import lombok.*;

import java.util.Date;

@NoArgsConstructor @AllArgsConstructor
@Builder @Getter @Setter
public class NEOCloseApproachData {

    private Date closeApproachDate;

    private Double relativeVelocityInKmps;

    private Double relativeVelocityInKmph;

    private Double relativeVelocityInMph;

    private String orbitingBody;

}
