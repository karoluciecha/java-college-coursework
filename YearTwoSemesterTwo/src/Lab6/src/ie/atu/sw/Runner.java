package ie.atu.sw;

import java.util.*;
import java.text.DecimalFormat;

public class Runner {
	public static void main(String[] args) throws Exception {
		var formatter = new DecimalFormat("#,###.00"); //Formats the time output
		var d = new Dictionary();
		d.load();
		
		var words = d.getSortedWords();
		var start = System.currentTimeMillis(); //Start the clock
		
		//Start adding code here:
		//Deque<String> queue = new ArrayDeque<>();
		//Queue<String> queue = new PriorityQueue<>(Comparator.comparing(String::hashCode));
		//Queue<String> queue = new PriorityQueue<>((s, t) -> s.length() - t.length());
		//Queue<String> queue = new PriorityQueue<>((s, t) -> -(s.length() - t.length()));
		//Queue<String> queue = new PriorityQueue<>((s, t) -> Integer.compare(s.length(), t.length()));
		Queue<String> queue = new PriorityQueue<>((s, t) -> -Integer.compare(s.length(), t.length()));
		
		for (String word : words) {
			queue.offer(word);
			}
		while (!queue.isEmpty()) {
			String word = queue.poll();
			System.out.println(word + " -> " + word.hashCode());
		}

		
		//Output the formatted time
		System.out.println("Time (ms):  " + formatter.format((System.currentTimeMillis() - start)));
	}	
}