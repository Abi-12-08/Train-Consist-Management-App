package TrainConsistManagementApp;

import java.util.ArrayList;
import java.util.List;

public class UC13 {

    // Reusing Bogie model
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
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
        System.out.println("UC10 - Count Total Seats in Train");
        System.out.println("===============================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 55));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Display bogies
        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ---- AGGREGATE using reduce ----
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)     // extract capacity
                .reduce(0, Integer::sum); // sum all values

        // Display total
        System.out.println("\nTotal seating capacity: " + totalSeats);
    }
}
