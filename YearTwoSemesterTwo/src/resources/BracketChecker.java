package resources;

import java.util.Arrays;

public class BracketChecker {
	/*
	 * The OPEN and CLOSE arrays are constants (static and final). Note that
	 * the indices of the open and close brackets in both arrays match the
	 * bracket type.  
	 */
	private static final char[] OPEN  = {'(','{','[', '<'};
	private static final char[] CLOSE = {')','}',']', '>'};
	
	//Create a new stack for char (Character) types
	private Stack<Character> stack = new Stack<>();	
	
	
	/*
	 * This method returns true if the brackets in a string expression
	 * match and are balanced.
	 * 
	 * What is the running time of this method and why?
	 */
    public boolean isBalanced(String expression) {
        var balanced = true;
        var index = 0;
        while (balanced && index < expression.length()) { //Loop over the string
            char c = expression.charAt(index); //Get the next character
            if (contains(OPEN, c)) {   	//If the next character is an open bracket
                stack.push(c);				//Push it on to the stack
            } else if (contains(CLOSE, c)) { //If the next character is an close bracket
            	/*
            	 * The brackets are balanced if the stack is not empty and the
            	 * closing and opening brackets match up 
            	 */
            	if (stack.isEmpty()) {
            		balanced = false;
            	}else {
                	balanced = haveSameIndex(stack.pop(), c);
            	}
            }
            index++; //Increment the index to move on to the next character
        }
        return (balanced && stack.isEmpty());
    }

    
    /*
     * This method returns true if two brackets match up, i.e. their index in their
     * respective arrays is the same. 
     * 
     * What is the running time for this method?
     */
    private boolean haveSameIndex(char openBracket, char closeBracket) {    	
    	return CLOSE[getIndex(OPEN, openBracket)] == closeBracket;
    }
    
    
    /*
     * This method takes in either the OPEN or CLOSE array and
     * returns the index of the char c in the array or -1 if c 
     * is not present.
     * 
     * What is the running time for this method?
     */
    private int getIndex(char[] list, char c) {
    	for (int index = 0; index < list.length; index++) {
    		if (list[index] == c) return index;
    	}
    	return -1;
    }
    
    
    /*
     * This method returns true if the array contains the char c. 
     * 
     * What is the running time of this method and would it make any
     * difference if the method used a for-loop or if-else-if statements
     * to check the char[] list?
     */
    private boolean contains(char[] list, char c) {
    	return Arrays.binarySearch(list, c) > -1;
    }
}