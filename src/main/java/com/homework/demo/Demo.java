package com.homework.demo;

import com.homework.entity.Address;
import com.homework.entity.User;

public class Demo {

    private void getOutput(String output) {
        System.out.println(output);
    }

    private String formatUserAddress(User user) {
        if (user.getAddress() == null) {
            return "Address not available.";
        }
        return """
                City: %s
                Street: %s
                Building: %s
                """.formatted(user.getAddress().city(), user.getAddress().street(), user.getAddress().buildingNumber());
    }

    public String setUserAddress() {
        User user = new User("John", "Smith");
        Address address = new Address("Khreshchatyk St", "Kiev", "123");
        user.setAddress(address);
        return """
                User's name: %s %s
                
                User's address:
                %s
                """.formatted(user.getFirstName(), user.getLastName(), formatUserAddress(user));
    }

    public void printResult(String output) {
        getOutput(output);
    }
}
