package TrainConsistManagementApp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UC11 {

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("UC11 - Validate Train ID and Cargo Code");
        System.out.println("===============================================\n");

        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // ---- REGEX RULES ----
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "[A-Z]{3}-[A-Z]{2}";

        // ---- VALIDATION ----
        boolean isTrainValid = Pattern.matches(trainPattern, trainId);
        boolean isCargoValid = Pattern.matches(cargoPattern, cargoCode);

        // ---- OUTPUT ----
        if (isTrainValid) {
            System.out.println("Train ID is valid.");
        } else {
            System.out.println("Train ID is INVALID.");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is valid.");
        } else {
            System.out.println("Cargo Code is INVALID.");
        }

        scanner.close();
    }
}