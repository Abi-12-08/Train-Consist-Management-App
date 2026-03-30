package TrainConsistManagementApp;

import java.util.HashSet;
import java.util.Set;

public class UC3 {

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("===============================================\n");

        // Create a Set to store unique bogie IDs
        Set<String> bogies = new HashSet<>();

        // ---- ADD IDs (including duplicates) ----
        bogies.add("B6101");
        bogies.add("B6102");
        bogies.add("B6103");
        bogies.add("B6104");

        // Duplicate entries (will be ignored)
        bogies.add("B6101");
        bogies.add("B6102");

        // Display unique bogie IDs
        System.out.println("Unique bogie IDs: " + bogies);

        // Display total unique count
        System.out.println("Total unique bogies: " + bogies.size());
    }
}