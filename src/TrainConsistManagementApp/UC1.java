package TrainConsistManagementApp;

import java.util.ArrayList;
import java.util.List;

public class UC1 {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("===============================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("===============================================\n");

        // Create a dynamic list to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist information
        System.out.println("Train initialized successfully...");

        // Display current state (empty list)
        System.out.println("Current train consist: " + trainConsist);

        // Display bogie count
        System.out.println("Number of bogies: " + trainConsist.size());
    }
}
