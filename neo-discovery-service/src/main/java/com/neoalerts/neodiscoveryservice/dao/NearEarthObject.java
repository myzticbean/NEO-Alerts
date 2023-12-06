package com.neoalerts.neodiscoveryservice.dao;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "near_earth_object")
@Data
public class NearEarthObject {

    @PrimaryKey
    private NeoPrimaryKey neoPrimaryKey;

    @Column("neo_reference_id")
    @CassandraType(type = CassandraType.Name.BIGINT)
    private Long neoReferenceId;

    @Column("name")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String name;

    @Column("nasa_jpl_url")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String nasaJplUrl;

    @Column("neo_estimated_diameter")
    @CassandraType(type = CassandraType.Name.UDT, userTypeName = "neo_estimated_diameter")
    private NeoEstimatedDiameter neoEstimatedDiameter;

    @Column("is_potentially_hazardous_asteroid")
    @CassandraType(type = CassandraType.Name.BOOLEAN)
    private Boolean isPotentiallyHazardousAsteroid;

    @Column("neo_close_approach_data")
    @CassandraType(type = CassandraType.Name.UDT, userTypeName = "neo_close_approach_data")
    private NeoCloseApproachData neoCloseApproachData;

    @Column("is_sentry_object")
    @CassandraType(type = CassandraType.Name.BOOLEAN)
    private Boolean isSentryObject;

}
