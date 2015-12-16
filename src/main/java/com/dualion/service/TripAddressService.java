package com.dualion.service;

import com.dualion.domain.TripAddress;
import com.dualion.repository.TripAddressRepository;
import com.dualion.repository.search.TripAddressSearchRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service("tripAddressService")
public class TripAddressService {

    @Inject
    private TripAddressRepository tripAddressRepository;

    @Inject
    private TripAddressSearchRepository tripAddressSearchRepository;

    public TripAddress createTripAddress(TripAddress tripAddress) {
        TripAddress result = tripAddressRepository.save(tripAddress);
        if (result != null) tripAddressSearchRepository.save(result);
        return result;
    }

}
