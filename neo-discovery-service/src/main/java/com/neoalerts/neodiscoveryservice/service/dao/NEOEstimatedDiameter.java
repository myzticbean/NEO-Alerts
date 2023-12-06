package com.neoalerts.neodiscoveryservice.service.dao;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter @Setter
public class NEOEstimatedDiameter {

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
