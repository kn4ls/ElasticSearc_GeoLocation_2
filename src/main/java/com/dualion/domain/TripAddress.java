package com.dualion.domain;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


/**
 * A TripAddress.
 */
@Entity
@Table(name = "trip_address")
@Document(indexName="trip_address")
public class TripAddress implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(columnDefinition="long", name="address_id")
    @Field(type = FieldType.Nested)
    private Address address;

    @ManyToOne
    @JoinColumn(columnDefinition="long", name="trip_id")
    @Field(type = FieldType.Nested)
    private Trip trip;

    public TripAddress() {
    }

    public TripAddress(Address address, Trip trip) {
        this.address = address;
        this.trip = trip;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TripAddress tripAddress = (TripAddress) o;
        return Objects.equals(id, tripAddress.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "TripAddress{" +
            "id=" + id +
            '}';
    }
}
