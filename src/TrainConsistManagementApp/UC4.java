package TrainConsistManagementApp;

import java.util.LinkedList;
import java.util.List;

public class UC4 {

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("===============================================\n");

        // Create a LinkedList
        List<String> trainConsist = new LinkedList<>();

        // ---- ADD bogies in sequence ----
        trainConsist.add("B1");
        trainConsist.add("B2");
        trainConsist.add("B3");

        System.out.println("After adding bogies: " + trainConsist);

        // ---- INSERT at specific position ----
        trainConsist.add(1, "B1.5"); // insert at index 1

        System.out.println("After inserting at position 1: " + trainConsist);

        // ---- REMOVE from front ----
        trainConsist.remove(0);

        System.out.println("After removing from front: " + trainConsist);

        // ---- REMOVE from rear ----
        trainConsist.remove(trainConsist.size() - 1);

        System.out.println("After removing from rear: " + trainConsist);

        // ---- FINAL STATE ----
        System.out.println("Final train consist: " + trainConsist);
        System.out.println("Total bogies: " + trainConsist.size());
    }
}