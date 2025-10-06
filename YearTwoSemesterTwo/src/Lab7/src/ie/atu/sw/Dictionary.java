package ie.atu.sw;

import java.util.*;
import java.io.*;

/* 
 * The Dictionary class has been altered to provide a choice of two data structures to use
 * for a word search - an array list and a hash table.
 */
public class Dictionary {
	private List<Word> words = new ArrayList<>(); //Instance variable of type List (an interface)
	//private Map<StrangeString, Word> wordMap = new HashMap<>(); //Instance variable of type Map (also an interface...)
	//private Map<StrangeString, Word> wordMap = new TreeMap<>();
	private Map<StrangeString, Word> wordMap = new TreeMap<>((n, m) -> n.getWord().compareTo(m.getWord()));
	private final String DICTIONARY_FILE = "./dictionary.txt"; //A string instance variable
	
	public void load() throws Exception{ //If anything goes wrong, throw the exception to the calling method. Very lazy indeed!
		try (var br = new BufferedReader(new InputStreamReader(new FileInputStream(DICTIONARY_FILE)))) {
			String next;
			while ((next = br.readLine()) != null) { //Loop through each line in the dictionary file
				 Word word = new Word(next); //Create a new Word object using the next word in the dictionary
				 words.add(word); //Add the word to our array list
				 wordMap.put(new StrangeString(next), word); //Also add the word to the hash map
			}
		} catch (Exception e) {
			throw new Exception("[ERROR] Encountered a problem reading the dictionary. " + e.getMessage());		
		}
	}
	
	public int size(){
		return words.size();
	}
	
	public Word[] getSortedWords(){
		return words.stream().toArray(Word[]::new);
	}
	
	public Map<StrangeString, Word> getWordMap(){
		return wordMap;
	}
}