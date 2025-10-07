package runners;

import java.text.DecimalFormat;
import java.util.*;

import resources.Dictionary;
import resources.StrangeString;
import resources.Word;

public class RunnerSix {
    public static void main(String[] args) throws Exception {
        var formatter = new DecimalFormat("#,###.00"); // Formats the time output
        var dictionary = new Dictionary(); // Instantiate the dictionary
        dictionary.load(); // Load the dictionary into memory

        var searchTerm = "Zyzzogeton"; // Specify the search word

        System.out.println("Execution started...\n");
        
        // 1) Using an indexed list is O(n)
        Word[] list = dictionary.getSortedWordsW(); // Get an indexed list of the words
        var start = System.currentTimeMillis(); // Start the clock

        // Linear Search O(n): Loop over each word in the list until we find what we're looking for
        boolean found = false;
        for (int i = 0; i < list.length; i++) {
            Word word = list[i];
            if (word.getWord().equalsIgnoreCase(searchTerm)) {
                double searchTime = ((System.currentTimeMillis() - start) / 1000.0); // Stop the clock and calculate seconds
                System.out.println(
                        "Found word " + searchTerm + " at index " + i + " in " + formatter.format(searchTime) + "s.");
                found = true;
                break;
            }
        }
        if (!found) {
            double searchTime = ((System.currentTimeMillis() - start) / 1000.0);
            System.out.println(searchTerm + " is not in the list (linear search). Time taken: " + formatter.format(searchTime) + "s.");
        }

        // 2) Map Search is either O(1) for HashMap or O(log n) for TreeMap
        Map<StrangeString, Word> map = dictionary.getWordMap(); // Get a map of the words
        start = System.currentTimeMillis(); // Reset the clock
        var ss = new StrangeString(searchTerm); // Wrap the search term in our custom object
        if (map.containsKey(ss)) { // Check if key exists in map. O(1) or O(log n)
            Word word = map.get(ss); // Get the word associated with the key
            System.out.println("Found word " + word.getWord() + " in " + formatter.format((System.currentTimeMillis() - start) / 1000.0) + "s."); // Print result
        } else {
            System.out.println(searchTerm + " is not in the dictionary (map search).");
        }

        // Print words that end with "able"
        Set<StrangeString> keys = map.keySet();
        System.out.println("\nWords ending with 'able':");
        for (StrangeString key : keys) {
            if (key.getWord().endsWith("able")) {
                System.out.println(map.get(key));
            }
        }

        // Demonstrate iterating over the collection of Word values
        Collection<Word> words = map.values();
        System.out.println("\nIterating over word values in map...");
        for (Word w : words) {
            // Accessing w.getWord() here as demonstration (comment: can be slow)
            w.getWord();
        }
        System.out.println("Completed iteration over map values.");
    }
}