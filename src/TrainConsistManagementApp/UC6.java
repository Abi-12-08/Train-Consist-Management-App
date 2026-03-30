package TrainConsistManagementApp;

import java.util.HashMap;
import java.util.Map;

public class UC6 {

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("===============================================\n");

        // HashMap stores data in key -> value format
        Map<String, Integer> capacityMap = new HashMap<>();

        // ---- INSERT bogie capacities ----
        capacityMap.put("B1", 50);
        capacityMap.put("B2", 60);
        capacityMap.put("B3", 55);
        capacityMap.put("B4", 65);

        // ---- DISPLAY all bogies with capacity ----
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " -> Capacity: " + entry.getValue());
        }

        // ---- DISPLAY total bogies ----
        System.out.println("\nTotal bogies: " + capacityMap.size());
    }
}
