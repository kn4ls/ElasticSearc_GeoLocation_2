package com.dualion.repository.search;

import com.dualion.domain.TripAddress;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripAddressSearchRepository extends ElasticsearchRepository<TripAddress, Long>{

}
