package ie.atu.sw;

import java.text.DecimalFormat;
import java.util.*;
public class Runner {
	public static void main(String[] args) throws Exception{
		var formatter = new DecimalFormat("#,###.00"); //Formats the time output
		var dictionary = new Dictionary(); //Instantiate the dictionary
		dictionary.load(); //Load the dictionary into memory
		
		var searchTerm = "Zyzzogeton"; //Specify the search word

		// 1) Using an indexed list is O(n)
		Word[] list = dictionary.getSortedWords(); //Get an indexed list of the words
		var start = System.currentTimeMillis(); //Start the clock
		
		/*
		//Linear Search O(n): Loop over each word in the list until we find what we're looking for
		for (int i = 0; i < list.length; i++) {
			Word word = list[i];
			if (word.getWord().equalsIgnoreCase(searchTerm)){
				double searchTime = ((System.currentTimeMillis() - start)/1000); //Stop the clock and print out the result
				System.out.println("Found word " + searchTerm + " at index " + i +  " in " + formatter.format(searchTime) + "ms.");
				break;
			}
		}
		*/
		
		//2) Map Search is either O(1) for as HashMap or O(log(n)) for a TreeMap
		Map<StrangeString, Word> map = dictionary.getWordMap(); //Get a hash map of the words 
		start = System.currentTimeMillis(); //Reset the clock
		var ss = new StrangeString(searchTerm); //Wrap the search term in our custom object
		if (map.containsKey(ss)){ //Check if key exists in hash table. This is an O(1) operation
			Word word = map.get(ss); //Get the values associated with the key in the hash table. Also O(1)
			System.out.println("Found word " + word.getWord() + " in " + formatter.format((System.currentTimeMillis() - start)/1000) + "ms."); //Print result
		}else{
			System.out.println(searchTerm + " is not in the dictionary"); //Word is not in the hash table
		}
		
		Set<StrangeString> keys = map.keySet();
		
		for (StrangeString key : keys) {
			if (key.getWord().endsWith("able")) {
				System.out.println(map.get(key));
			}
		}
		
		Collection<Word> words = map.values();
		
		for (Word w : words) {
			w.getWord(); // Very slow (0.1s per word)
		}
	}
}