package TrainConsistManagementApp;

import java.util.ArrayList;
import java.util.List;

public class UC12 {

    // Goods Bogie model
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " (" + cargo + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("===============================================\n");

        // Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Closed", "Hazardous"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Closed", "Chemicals"));
        goodsBogies.add(new GoodsBogie("Closed", "Hazardous"));

        // Display bogies
        System.out.println("Goods Bogies:");
        for (GoodsBogie g : goodsBogies) {
            System.out.println(g);
        }

        // ---- SAFETY CHECK using allMatch ----
        boolean isSafe = goodsBogies.stream()
                .allMatch(g ->
                        !g.cargo.equalsIgnoreCase("Hazardous") ||
                                g.type.equalsIgnoreCase("Closed")
                );

        // ---- OUTPUT ----
        if (isSafe) {
            System.out.println("\nAll bogies comply with safety rules.");
        } else {
            System.out.println("\nSafety violation detected!");
        }
    }
}