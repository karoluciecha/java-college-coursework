package runners;

import java.util.*;

import resources.Dictionary;
import resources.QueueTester;

public class RunnerFive {
    public static void main(String[] args) throws Exception {
        var d = new Dictionary();
        d.load();

        var words = d.getSortedWords();
        System.out.println("Loaded " + words.length + " words.\n");

        // ArrayDeque example (no comparator, no priority)
        QueueTester.runQueueExample(words, new ArrayDeque<>(), "ArrayDeque (no comparator, insertion order)");

        // PriorityQueue by hashCode ascending
        QueueTester.runQueueExample(words, new PriorityQueue<>(Comparator.comparing(String::hashCode)),
            "PriorityQueue by hashCode ascending");

        // PriorityQueue by word length ascending
        QueueTester.runQueueExample(words, new PriorityQueue<>((s, t) -> s.length() - t.length()),
            "PriorityQueue by word length ascending");

        // PriorityQueue by negative difference (word length descending)
        QueueTester.runQueueExample(words, new PriorityQueue<>((s, t) -> -(s.length() - t.length())),
            "PriorityQueue by word length descending (using negated subtraction)");

        // PriorityQueue using Integer.compare (word length ascending)
        QueueTester.runQueueExample(words, new PriorityQueue<>((s, t) -> Integer.compare(s.length(), t.length())),
            "PriorityQueue by word length ascending (using Integer.compare)");

        // PriorityQueue using negative Integer.compare (word length descending)
        QueueTester.runQueueExample(words, new PriorityQueue<>((s, t) -> -Integer.compare(s.length(), t.length())),
            "PriorityQueue by word length descending (using negated Integer.compare)");
    }
}