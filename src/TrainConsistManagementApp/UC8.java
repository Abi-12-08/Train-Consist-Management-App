package TrainConsistManagementApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UC8 {

    // Reusing Bogie model from UC7
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
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("===============================================\n");

        // Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("B1", 50));
        bogies.add(new Bogie("B2", 70));
        bogies.add(new Bogie("B3", 60));
        bogies.add(new Bogie("B4", 40));

        // ---- FILTER bogies with capacity >= 60 ----
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity >= 60)
                .collect(Collectors.toList());

        // ---- DISPLAY result ----
        System.out.println("All bogies: " + bogies);
        System.out.println("Filtered bogies (capacity >= 60): " + filteredBogies);
    }
}
