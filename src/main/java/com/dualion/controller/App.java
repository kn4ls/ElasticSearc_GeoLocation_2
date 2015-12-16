package com.dualion.controller;

import javax.inject.Inject;

import com.dualion.domain.Address;
import com.dualion.domain.TripAddress;
import com.dualion.service.AddressService;
import com.dualion.service.TripAddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.dualion.domain.Car;
import com.dualion.domain.Trip;
import com.dualion.service.TripService;

@Component
public class App implements ApplicationRunner {

	private final Logger log = LoggerFactory.getLogger(ApplicationRunner.class);
	
	/*@Inject
	private TripService tripService; 

	@Inject
	private AddressService addressService;

	@Inject
	private TripAddressService tripAddressService;*/

	@Override
	public void run(ApplicationArguments args) throws Exception {

		log.info("Create Addresses:");
		log.info("-------------------------------");
		/*Address oficina = addressService.CreateAddress(new Address("C\\alcala", "Madrid", "España", "[40.4335419,-3.6472188000000187]"));
		Address home_1 = addressService.CreateAddress(new Address("C\\Daniel Urrabieta", "Madrid", "España", "[40.44955971899028, -3.68666]"));
		Address home_2 = addressService.CreateAddress(new Address("C\\Daniel Urrabieta", "Madrid", "España", "[40.44955971899028, -3.68666]"));
		log.info("");

		log.info("Create Trips:");
		log.info("-------------------------------");
		Trip trip_1 = tripService.createTrip(new Trip("Primer viatge", new Car(1)));
		Trip trip_2 = tripService.createTrip(new Trip("Segon viatge", new Car(2)));
		Trip trip_3 = tripService.createTrip(new Trip("Tercer viatge", new Car(3)));
		Trip trip_4 = tripService.createTrip(new Trip("Cuart viatge", new Car(4)));
		log.info("");

		log.info("Create Trip Addresses:");
		log.info("-------------------------------");
		TripAddress tripAddress_1 =  tripAddressService.createTripAddress(new TripAddress(home_1, trip_1));
		TripAddress tripAddress_2 = tripAddressService.createTripAddress(new TripAddress(oficina, trip_1));
		TripAddress tripAddress_3 =  tripAddressService.createTripAddress(new TripAddress(home_2, trip_2));
		TripAddress tripAddress_4 = tripAddressService.createTripAddress(new TripAddress(oficina, trip_2));
		TripAddress tripAddress_5 =  tripAddressService.createTripAddress(new TripAddress(oficina, trip_3));
		TripAddress tripAddress_6 = tripAddressService.createTripAddress(new TripAddress(home_1, trip_3));
		TripAddress tripAddress_7 =  tripAddressService.createTripAddress(new TripAddress(oficina, trip_4));
		TripAddress tripAddress_8 = tripAddressService.createTripAddress(new TripAddress(home_2, trip_4));
		log.info("");


		log.info("Trips found with findAllTrips():");
		log.info("-------------------------------");
		for (Trip trips : tripService.findAllTrips()) {
			log.info(trips.toString());
		}
        log.info("");*/
        
        /*log.info("Trips found with findByGeoLocation():");
		log.info("-------------------------------");
		for (Trip trips : tripService.findByGeoLocation(40.0, -74.0, 500, DistanceUnit.KILOMETERS)) {
			log.info(trips.toString());
		}
        log.info("");
        
        log.info("Trips found with findByGeoLocation():");
		log.info("-------------------------------");
		for (Trip trips : tripService.findByGeoLocation2(40.0, -74.0, 500, DistanceUnit.KILOMETERS)) {
			log.info(trips.toString());
		}
        log.info("");
		
        log.info("Trips found with findByGeoLocationSort():");
		log.info("-------------------------------");
		for (Trip trips : tripService.findByGeoLocationSort(40.0, -74.0, 500, DistanceUnit.KILOMETERS, SortOrder.ASC)) {
			log.info(trips.toString());
		}
        log.info("");*/
        
	}
	
}