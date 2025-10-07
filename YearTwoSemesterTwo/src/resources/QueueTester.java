package resources;

import java.util.*;
import java.text.DecimalFormat;

public class QueueTester {

    private static final DecimalFormat formatter = new DecimalFormat("#,###.00");

    public static void runQueueExample(String[] words, Queue<String> queue, String description) {
        System.out.println("--- Running: " + description + " ---");
        long start = System.currentTimeMillis();

        for (String word : words) {
            queue.offer(word);
        }

        int count = 0;
        while (!queue.isEmpty() && count < 20) {
            String word = queue.poll();
            System.out.println(word + " -> " + word.hashCode());
            count++;
        }

        if (!queue.isEmpty()) {
            System.out.println("... Output truncated. Remaining words in queue: " + queue.size());
        }

        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Time (ms): " + formatter.format(elapsed));
        System.out.println();
    }
}
