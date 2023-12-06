package com.neoalerts.neodiscoveryservice.dao;

import lombok.Data;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;

@PrimaryKeyClass
@Data
public class NeoPrimaryKey implements Serializable {

    @PrimaryKeyColumn(name = "id", type = PrimaryKeyType.PARTITIONED)
    @Column("id")
    private Long id;

}
