package TrainConsistManagementApp;

import java.util.ArrayList;
import java.util.List;

public class UC14 {

    // ---- CUSTOM EXCEPTION ----
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // ---- Passenger Bogie Model ----
    static class PassengerBogie {
        String name;
        int capacity;

        PassengerBogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Invalid capacity for " + name);
            }
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("UC14 - Handle Invalid Bogie Capacity");
        System.out.println("===============================================\n");

        List<PassengerBogie> bogies = new ArrayList<>();

        // ---- ADD BOGIES WITH VALIDATION ----
        try {
            bogies.add(new PassengerBogie("B1", 50));
            bogies.add(new PassengerBogie("B2", -10)); // invalid
            bogies.add(new PassengerBogie("B3", 60));
        } catch (InvalidCapacityException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // ---- DISPLAY VALID BOGIES ----
        System.out.println("\nValid Bogies:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }
    }
}