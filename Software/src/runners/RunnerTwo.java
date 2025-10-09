package runners;

import java.util.*;

import resources.Dictionary;

public class RunnerTwo {
    public static void main(String[] args) throws Exception {
        System.out.println("---------- Lists & Collections ----------");
        Dictionary dictionary = new Dictionary();
        dictionary.load();
        System.out.println("Dictionary contains " + dictionary.size() +  " words.\n");

        long startTime = System.nanoTime();
        boolean slow = true; 
        String[] words = dictionary.getSortedWords(slow); 
        System.out.println("Time: " + (System.nanoTime() - startTime)); 
        System.out.println("Array contains " + words.length + " words."); 
        System.out.println("Amortized Time: " + slow + "\n"); 
        
        // Various collection instantiations
        ArrayList<String> listOne = new ArrayList<String>();
        System.out.println("Created ArrayList<String> listOne.");
        LinkedList<String> listOneL = new LinkedList<String>();
        System.out.println("Created LinkedList<String> listOneL.");
        Vector<String> listOneV = new Vector<String>();
        System.out.println("Created Vector<String> listOneV.\n");

        // Diamond notation examples
        ArrayList<String> listTwo = new ArrayList<>();
        System.out.println("Created ArrayList<String> listTwo = new ArrayList<>(); (diamond notation).");
        LinkedList<String> listTwoL = new LinkedList<>();
        System.out.println("Created LinkedList<String> listTwoL = new LinkedList<>(); (diamond notation).");
        Vector<String> listTwoV = new Vector<>();
        System.out.println("Created Vector<String> listTwoV = new Vector<>(); (diamond notation).\n");

        // List interface examples
        List<String> listThree = new ArrayList<>();
        System.out.println("Created List<String> listThree = new ArrayList<>();");
        List<String> listThreeL = new LinkedList<>();
        System.out.println("Created List<String> listThreeL = new LinkedList<>();");
        List<String> listThreeV = new Vector<>();
        System.out.println("Created List<String> listThreeV = new Vector<>();\n");

        // Collection interface examples
        Collection<String> colOne = new ArrayList<>();
        System.out.println("Created Collection<String> colOne = new ArrayList<>();");
        Collection<String> colOneL = new LinkedList<>();
        System.out.println("Created Collection<String> colOneL = new LinkedList<>();");
        Collection<String> colOneV = new Vector<>();
        System.out.println("Created Collection<String> colOneV = new Vector<>();");

        // Using var
        var listFour = new ArrayList<String>();
        System.out.println("Created var listFour = new ArrayList<String>();");
        var listFourL = new LinkedList<String>();
        System.out.println("Created var listFourL = new LinkedList<String>();");
        var listFourV = new Vector<String>();
        System.out.println("Created var listFourV = new Vector<String>();\n");

        // Adding words using for loop
        startTime = System.nanoTime();
        for (String s : words) {
            listThree.add(s);
        }
        System.out.println("Added words to listThree using foreach loop.");
        System.out.println("Time: " + (System.nanoTime() - startTime) + "\n"); 

        // Adding to the front using LinkedList for fast addition
        startTime = System.nanoTime();
        for (int i = 0; i < words.length; i++) {
            listThreeL.add(0, words[i]);
        }
        System.out.println("Added words to front of listThreeL (LinkedList) using index 0.\n");
        System.out.println("Time: " + (System.nanoTime() - startTime) + "\n"); 

        // Shuffle the list
        Collections.shuffle(listThree);
        System.out.println("Shuffled listThree.\n");

        // Removing by searching for each word
        startTime = System.nanoTime();
        for (String word : words) {
            listThree.remove(word);
        }
        System.out.println("Removed each word from listThree by searching.\n");
        System.out.println("Time: " + (System.nanoTime() - startTime) + "\n"); 

        // Removing from end
        startTime = System.nanoTime();
        for (String word : words) {
            if (!listThreeL.isEmpty()) {
                listThreeL.remove(listThreeL.size() - 1);
            }
        }
        System.out.println("Removed word from end of listThreeL until empty.\n");
        System.out.println("Time: " + (System.nanoTime() - startTime) + "\n"); 

        // Removing from front
        startTime = System.nanoTime();
        for (int i = 0; i < words.length; i++) {
            if (!listThreeV.isEmpty()) {
                listThreeV.remove(0);
            }
        }
        System.out.println("Removed word from front of listThreeV until empty.\n");
        System.out.println("Time: " + (System.nanoTime() - startTime) + "\n"); 

        // Contains and indexOf
        startTime = System.nanoTime();
        boolean foundGalway = listFour.contains("Galway");
        System.out.println("Does listFour contain 'Galway'? " + foundGalway);
        int indexGalway = listFour.indexOf("Galway");
        System.out.println("Index of 'Galway' in listFour: " + indexGalway + "\n");

        // Fast random access
        if (listFourV.size() > 7777) {
            System.out.println("Fast access: listFourV.get(7777) = " + listFourV.get(7777) + "\n");
        } else {
            System.out.println("Cannot access index 7777 in listFourV (size too small).\n");
        }

        System.out.println("Size of listThree after operations: " + listThree.size());
        System.out.println("Running time (ns): " + (System.nanoTime() - startTime));
    }
}