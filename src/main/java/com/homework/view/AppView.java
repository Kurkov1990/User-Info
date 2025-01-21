package com.homework.view;

import com.homework.entity.Address;
import com.homework.entity.User;

public class AppView {

    private static final Address address = new Address("Khreshchatyk St", "Kiev", "123");
    private static final User user = new User("John", "Smith", address);

    private static void getOutput(String output) {
        System.out.println(output);
    }

    private static String formatUserAddress() {
        if (user.getAddress() == null) {
            return "Address not available.";
        }
        return """
                User's name: %s %s
                User's address:
                City: %s
                Street: %s
                Building: %s
                """.formatted(user.getFirstName(), user.getLastName(),user.getAddress().getCity(), user.getAddress().getStreet(), user.getAddress().getBuildingNumber());
    }

   public static void run() {
       printResult(formatUserAddress());
       Address newAddress = new Address("Elm St", "Shelbyville", "456");
       user.setAddress(newAddress);
       printResult("""
        Address after changing:
        City: %s
        Street: %s
        Building: %s
        """.formatted(user.getAddress().getCity(), user.getAddress().getStreet(), user.getAddress().getBuildingNumber()));
    }

    public static void printResult(String newAddress) {
        getOutput(newAddress);
    }
}
