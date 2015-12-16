package com.dualion.domain;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.GeoPointField;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


/**
 * A Address.
 */
@Entity
@Table(name = "address")
@Document(indexName="address", shards = 2, replicas = 0)
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String address_1;

    @Column
    private String locality;

    @Column
    private String country;

    @Column
    @GeoPointField //Lat Lon as String
    private String location;

    public Address() {
    }

    public Address(String address_1, String locality, String country, String location) {
        this.address_1 = address_1;
        this.locality = locality;
        this.country = country;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress_1() {
        return address_1;
    }

    public void setAddress_1(String address_1) {
        this.address_1 = address_1;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Address address = (Address) o;

        return Objects.equals(id, address.id);

    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", address_1=" + address_1 +
                ", locality=" + locality +
                ", country=" + country +
                ", location=" + location +
                '}';
    }
}
