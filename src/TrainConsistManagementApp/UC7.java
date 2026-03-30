package TrainConsistManagementApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UC7 {

    // Inner Bogie class
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
        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("===============================================\n");

        // Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();

        // ---- ADD bogies ----
        bogies.add(new Bogie("B1", 50));
        bogies.add(new Bogie("B2", 70));
        bogies.add(new Bogie("B3", 60));
        bogies.add(new Bogie("B4", 40));

        // ---- DISPLAY unsorted ----
        System.out.println("Before sorting: " + bogies);

        // ---- SORT using Comparator (by capacity) ----
        Collections.sort(bogies, new Comparator<Bogie>() {
            @Override
            public int compare(Bogie b1, Bogie b2) {
                return b1.capacity - b2.capacity; // ascending order
            }
        });

        // ---- DISPLAY sorted ----
        System.out.println("After sorting by capacity: " + bogies);
    }
}