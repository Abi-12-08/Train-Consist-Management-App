package TrainConsistManagementApp;

import java.util.LinkedHashSet;
import java.util.Set;

public class UC5 {

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("===============================================\n");

        // LinkedHashSet preserves order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // ---- ADD bogies (including duplicates) ----
        formation.add("B1");
        formation.add("B2");
        formation.add("B3");
        formation.add("B4");

        // Duplicate entries (will NOT be added)
        formation.add("B2");
        formation.add("B3");

        // ---- DISPLAY final formation ----
        System.out.println("Final train formation: " + formation);

        // ---- DISPLAY count ----
        System.out.println("Total bogies: " + formation.size());
    }
}