package com.dualion.service;

import com.dualion.domain.Address;
import com.dualion.repository.AddressRepository;
import com.dualion.repository.search.AddressSearchRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

import static org.elasticsearch.index.query.FilterBuilders.boolFilter;
import static org.elasticsearch.index.query.FilterBuilders.geoDistanceFilter;
import static org.elasticsearch.index.query.FilterBuilders.nestedFilter;
import static org.elasticsearch.index.query.FilterBuilders.queryFilter;

import static org.elasticsearch.index.query.QueryBuilders.boolQuery;
import static org.elasticsearch.index.query.QueryBuilders.fuzzyLikeThisFieldQuery;
import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;
import static org.elasticsearch.index.query.QueryBuilders.rangeQuery;


@Service("addressService")
public class AddressService {

    private final Logger log = LoggerFactory.getLogger(AddressService.class);

    @Inject
    private AddressRepository addressRepository;

    @Inject
    private AddressSearchRepository addressSearchRepository;

    @Transactional
    public Address CreateAddress(Address address) {
        Address result = addressRepository.save(address);
        if(result != null) addressSearchRepository.save(result);
        return result;
    }

}
