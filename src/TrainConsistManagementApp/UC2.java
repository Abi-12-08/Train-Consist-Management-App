package TrainConsistManagementApp;

import java.util.ArrayList;
import java.util.List;

public class UC2 {

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("===============================================\n");

        // Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // -------- CREATE (Add bogies) --------
        passengerBogies.add("Bogie1");
        passengerBogies.add("Bogie2");
        passengerBogies.add("Bogie3");

        System.out.println("After adding bogies: " + passengerBogies);

        // -------- DELETE (Remove bogie) --------
        passengerBogies.remove("Bogie2");

        System.out.println("After removing Bogie2: " + passengerBogies);

        // -------- READ (Check availability) --------
        if (passengerBogies.contains("Bogie1")) {
            System.out.println("Bogie1 is available in the train.");
        } else {
            System.out.println("Bogie1 is NOT available.");
        }

        // -------- FINAL STATE --------
        System.out.println("Final train consist: " + passengerBogies);
        System.out.println("Total bogies: " + passengerBogies.size());
    }
}
