package runners;

import static java.lang.System.*;

import java.util.concurrent.ThreadLocalRandom;

import resources.Dictionary;

public class RunnerOne {
	public static void main(String[] args) throws Exception {
		out.println("---------- Big-O Time Complexity ----------");
		var dictionary = new Dictionary();
		dictionary.load();
		out.println("\nDictionary contains " + dictionary.size() + " words.");

		String[] words = dictionary.getSortedWords();
		long startTime = System.nanoTime();
		int idx = ThreadLocalRandom.current().nextInt(0, words.length);
		out.println(idx);
		out.println(words[idx]);
		out.println("Running time (ns): " + (System.nanoTime() - startTime));

		 // Measure time for isArrayOver100
	    startTime = System.nanoTime();
	    boolean isOver100 = isArrayOver100(words);
	    long endTime = System.nanoTime();
	    System.out.println("\nisArrayOver100: " + isOver100);
	    System.out.println("Running time (ns): " + (endTime - startTime));

	    // Measure time for contains
	    startTime = System.nanoTime();
	    boolean containsGalway = contains(words, "Galway");
	    endTime = System.nanoTime();
	    System.out.println("\ncontains 'Galway': " + containsGalway);
	    System.out.println("Running time (ns): " + (endTime - startTime));

	    // Measure time for binarySearch
	    startTime = System.nanoTime();
	    int foundIdx = binarySearch(words, "Galway");
	    endTime = System.nanoTime();
	    System.out.println("\nbinarySearch 'Galway' index: " + foundIdx);
	    System.out.println("Running time (ns): " + (endTime - startTime));

	    // Measure time for containsDuplicates
	    startTime = System.nanoTime();
	    boolean hasDuplicates = containsDuplicates(words);
	    endTime = System.nanoTime();
	    System.out.println("\ncontainsDuplicates: " + hasDuplicates);
	    System.out.println("Running time (ns): " + (endTime - startTime));
	}

	// Running time: O(1)
	public static boolean isArrayOver100(String[] words) {
		return words.length > 100;
	}

	// Running time: O(N);
	public static boolean contains(String[] words, String value) {
		for (int i = 0; i < words.length; i++) {
			if (words[i] == value)
				return true;
		}
		return false;
	}

	/*
	 * Running time: O(log n) A sorted array can be quickly searched using a binary
	 * search. The basic idea is to speed up an array search by applying a divide
	 * and conquer strategy. The search criterion is compared to the middle item of
	 * an array. If the search criterion is less than the middle element, a binary
	 * search is recursively applied on the first half. Otherwise, the second half
	 * of the array is recursively searched. The following method implements a
	 * binary search of a String[] for a given search string key:
	 */
	public static int binarySearch(String[] sorted, String key) {
		int first = 0;
		int upto = sorted.length;

		while (first < upto) {
			int mid = (first + upto) / 2; // Compute mid point.
			if (key.compareTo(sorted[mid]) < 0) {
				upto = mid; // repeat search in bottom half.
			} else if (key.compareTo(sorted[mid]) > 0) {
				first = mid + 1; // Repeat search in top half.
			} else {
				return mid; // Found it. Return position
			}
		}
		return -(first + 1); // Failed to find key
	}

	// Running time: O(n^2)
	public static boolean containsDuplicates(String[] args) {
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args.length; j++) {
				if (i == j)
					break;
				if (args[i] == args[j])
					return true;
			}
		}
		return false;
	}
}