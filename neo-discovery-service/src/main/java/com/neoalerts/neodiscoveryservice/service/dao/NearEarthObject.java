package com.neoalerts.neodiscoveryservice.service.dao;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.Table;

//@Table(value = "near_earth_object")
@Data
@NoArgsConstructor @AllArgsConstructor
@Builder @Getter @Setter
public class NearEarthObject {

    private Long id;

    private Long neoReferenceId;

    private String name;

    private String nasaJplUrl;

    private NEOEstimatedDiameter neoEstimatedDiameter;

    private Boolean isPotentiallyHazardousAsteroid;

    private NEOCloseApproachData neoCloseApproachData;

    private Boolean isSentryObject;

}
