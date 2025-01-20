package com.homework.entity;

public class User {
    private final String firstName;
    private final String lastName;
    private Address address;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = null;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{name='" + firstName + "', surname='" + lastName + "',  address=" + address + "}";
    }
}
