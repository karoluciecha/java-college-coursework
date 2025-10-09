package resources;

import java.util.*;
import java.io.*;

public class Dictionary {
	private List<String> wordsS = new ArrayList<>();
	private List<Word> wordsW = new ArrayList<>(); //Instance variable of type List (an interface)
	private Map<StrangeString, Word> wordMap = new TreeMap<>((n, m) -> n.getWord().compareTo(m.getWord()));
	private final String DICTIONARY_FILE = "src/dictionary.txt";

	public void load() throws Exception {
		try (var br = new BufferedReader(new InputStreamReader(new FileInputStream(DICTIONARY_FILE)))) {
			String next;
			while ((next = br.readLine()) != null) {
				wordsS.add(next);
				Word word = new Word(next); //Create a new Word object using the next word in the dictionary
				 wordsW.add(word); //Add the word to our array list
				 wordMap.put(new StrangeString(next), word); //Also add the word to the hash map
			}
		} catch (Exception e) {
			throw new Exception("[ERROR] Encountered a problem reading the dictionary. " + e.getMessage());
		}
	}

	public int size() {
		return wordsS.size();
	}

	public String[] getSortedWords(){
		return wordsS.stream().toArray(String[]::new);
	}
	
	public Word[] getSortedWordsW(){
		return wordsW.stream().toArray(Word[]::new);
	}
	
	public Map<StrangeString, Word> getWordMap(){
		return wordMap;
	}
	
	/*
	 * This method is for demonstration purposes only and can be
	 * used to convert the List words into a String[] using a slow
	 * O(n^2) approach or an amortized O(1) method. Normally, you 
	 * should use the stream() method to convert the list into an
	 * array as shown above in getSortedWords().
	 */
	public String[] getSortedWords(boolean slow){
		final int INITIAL_CAPACITY = 8; 
		String[] array = new String[INITIAL_CAPACITY];
		for (int i = 0; i < wordsS.size(); i++){
			if (i == array.length - 1) array = expand(array, slow);
			array[i] = wordsS.get(i);
		}
		return array;
	}

	private String[] expand(String[] tmp, boolean slow){
		int newCapacity = slow ? tmp.length + 1 : (tmp.length * 3) / 2;
		return new String[newCapacity];
	}
}