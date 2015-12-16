package com.dualion.repository.search;

import com.dualion.domain.Address;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressSearchRepository extends ElasticsearchRepository<Address, Long> {

}