package com.dualion.domain;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.HashSet;
import java.util.Set;

@Entity
@Document(indexName = "trip")
@Table(name = "trip")
public class Trip {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	@Field(type=FieldType.String)
	private String name;

	@OneToMany(mappedBy = "trip")
	@Field(type = FieldType.Nested)
	private Set<TripAddress> tripAddresses = new HashSet<>();
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "id")
	@Field(type=FieldType.Nested)
	private Car car;
	
	public Trip() {	}

	public Trip(String name, Car car) {
		this.name = name;
		this.car = car;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Set<TripAddress> getTripAddresses() {
		return tripAddresses;
	}

	public void setTripAddresses(Set<TripAddress> tripAddresses) {
		this.tripAddresses = tripAddresses;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trip other = (Trip) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Trip [id=" + id + ", name=" + name + ", tripAddresses=" + tripAddresses + ", car=" + car + "]";
	}

	
	
}
