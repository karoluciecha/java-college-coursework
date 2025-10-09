package runners;

import java.util.ArrayList;
import java.util.LinkedList;

import resources.Dictionary;
import resources.SingleLinkedList;

public class RunnerThree {
    public static void main(String[] args) throws Exception {
        var list = new LinkedList<String>();
        var slist = new SingleLinkedList<String>();
        var alist = new ArrayList<String>();

        var d = new Dictionary();
        d.load();
        var words = d.getSortedWords();

        // Add to front
        long start = System.nanoTime();
        for (String word : words) {
            slist.addFirst(word);
        }
        System.out.println("AddFirst Single Linked List Time (ns): " + (System.nanoTime() - start) + "\n");

        start = System.nanoTime();
        for (String word : words) {
            list.addFirst(word);
        }
        System.out.println("AddFirst Linked List Time (ns): " + (System.nanoTime() - start) + "\n");

        start = System.nanoTime();
        for (String word : words) {
            alist.add(0, word); // Use add(0, ...) for ArrayList to add to front
        }
        System.out.println("AddFirst Array List Time (ns): " + (System.nanoTime() - start) + "\n");

        // Exercise 2: Add to middle (position 100000)
        start = System.nanoTime();
        for (String word : words) {
            slist.add(100000, word);
        }
        System.out.println("AddMiddle Single Linked List Time (ns): " + (System.nanoTime() - start) + "\n");

        start = System.nanoTime();
        for (String word : words) {
            list.add(100000, word);
        }
        System.out.println("AddMiddle Linked List Time (ns): " + (System.nanoTime() - start) + "\n");

        start = System.nanoTime();
        for (String word : words) {
            alist.add(100000, word);
        }
        System.out.println("AddMiddle Array List Time (ns): " + (System.nanoTime() - start) + "\n");

        // Exercise 3: Add to end
        start = System.nanoTime();
        for (String word : words) {
            slist.add(word);
        }
        System.out.println("AddLast Single Linked List Time (ns): " + (System.nanoTime() - start) + "\n");

        start = System.nanoTime();
        for (String word : words) {
            list.add(word);
        }
        System.out.println("AddLast Linked List Time (ns): " + (System.nanoTime() - start) + "\n");

        start = System.nanoTime();
        for (String word : words) {
            alist.add(word);
        }
        System.out.println("AddLast Array List Time (ns): " + (System.nanoTime() - start) + "\n");

        // Size after operations
        System.out.println("Final LinkedList size: " + list.size() + "\n");

        // Iterate and print each element
        start = System.nanoTime();
        var i = list.iterator();
        int count = 0;
        while (i.hasNext()) {
            System.out.println(i.next());
            count++;
            if (count > 10) break; // Print at most first 10 elements for demonstration
        }
        System.out.println("List iteration time for first 10 elements (ns): " + (System.nanoTime() - start));
    }
}