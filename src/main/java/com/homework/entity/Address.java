package com.homework.entity;

import java.util.Objects;

public class Address {
    private final String street;
    private final String city;
    private final String buildingNumber;

    public Address(String street, String city, String buildingNumber) {
        this.street = street;
        this.city = city;
        this.buildingNumber = buildingNumber;
    }

    @Override
    public String toString() {
        return "Address{street='" + street + "', city='" + city + "', buildingNumber='" + buildingNumber + "'}";
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Address) obj;
        return Objects.equals(this.street, that.street) &&
                Objects.equals(this.city, that.city) &&
                Objects.equals(this.buildingNumber, that.buildingNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, buildingNumber);
    }

}
