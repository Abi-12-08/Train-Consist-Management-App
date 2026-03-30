package TrainConsistManagementApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UC13 {

    // Bogie model
    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("===============================================\n");

        // Create large dataset
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 1; i <= 100000; i++) {
            bogies.add(new Bogie("Type" + i, i % 100));
        }

        // ---- LOOP FILTERING ----
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity >= 50) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---- STREAM FILTERING ----
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity >= 50)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ---- RESULTS ----
        System.out.println("Loop result size: " + loopResult.size());
        System.out.println("Stream result size: " + streamResult.size());

        System.out.println("\nLoop Time (ns): " + loopTime);
        System.out.println("Stream Time (ns): " + streamTime);

        // ---- COMPARISON ----
        if (loopTime < streamTime) {
            System.out.println("\nLoop is faster.");
        } else {
            System.out.println("\nStream is faster.");
        }
    }
}