package com.dualion.repository;

import com.dualion.domain.TripAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripAddressRepository extends JpaRepository<TripAddress,Long>{

}
