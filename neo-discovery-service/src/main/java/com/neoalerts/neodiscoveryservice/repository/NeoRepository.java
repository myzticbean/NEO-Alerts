package com.neoalerts.neodiscoveryservice.repository;

import com.neoalerts.neodiscoveryservice.dao.NearEarthObject;
import com.neoalerts.neodiscoveryservice.dao.NeoPrimaryKey;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeoRepository extends CassandraRepository<NearEarthObject, NeoPrimaryKey> {

    public void findByNeoReferenceId(Long neoReferenceId);

}
