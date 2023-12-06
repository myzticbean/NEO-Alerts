package com.neoalerts.neodiscoveryservice.service.neows.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class MissDistance {
    private String astronomical;
    private String lunar;
    private String kilometers;
    private String miles;
}
