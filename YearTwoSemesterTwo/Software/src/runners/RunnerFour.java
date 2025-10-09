package runners;

import resources.BracketChecker;
import resources.Dictionary;
import resources.PalindromeChecker;
import resources.Stack;

public class RunnerFour {

    public static void main(String[] args) throws Exception {
        // Test the PalindromeChecker with various examples
        System.out.println("---- PALINDROME CHECKER TESTS ----");
        String[] testPalindromes = {"NAVAN", "LEVEL", "Racecar", "HELLO", "MADAM"};
        for (String test : testPalindromes) {
            PalindromeChecker pc = new PalindromeChecker(test);
            System.out.println("Is \"" + test + "\" a palindrome? " + pc.isPalindrome());
        }
        System.out.println();

        // Test the BracketChecker with various bracket expressions
        System.out.println("---- BRACKET BALANCE CHECKS ----");
        String[] bracketTests = {
            "( a + b * ( c / ({ d } - e ) ) ) + ( d / e )",
            "[{ a + b } * ( c - d ) ]",
            "( ( [ ) ] )", // intentionally unbalanced
            "{[()]}",     // balanced
            "([)]"        // unbalanced
        };
        BracketChecker checker = new BracketChecker();
        for (String expr : bracketTests) {
            System.out.println("Expression: " + expr);
            System.out.println("Balanced? " + checker.isBalanced(expr));
        }
        System.out.println();

        // Load the dictionary for analysis - words list demo
        System.out.println("---- DICTIONARY STACK USAGE ----");
        var dictionary = new Dictionary();
        dictionary.load();
        var words = dictionary.getSortedWords();

        // Push words onto a stack and explain why this reverses their order
        var wordStack = new Stack<String>();
        System.out.println("Pushing dictionary words onto a stack...");
        for (String word : words) {
            wordStack.push(word);
        }
        System.out.println("All words pushed (stack now holds them in reverse order).");
        System.out.println();

        // Example: Pop a few words to demonstrate LIFO
        System.out.println("First 5 words popped from stack (the last ones added):");
        for (int i = 0; i < 5 && !wordStack.isEmpty(); i++) {
            System.out.println("Popped: " + wordStack.pop());
        }
        System.out.println();

        // Re-push words for feature test (to refill the stack)
        for (String word : words) {
            wordStack.push(word);
        }

        // Advanced filtering: Find words with specified letter pattern
        System.out.println("Words where 2nd letter is 'y' and 4th letter is 'w':");
        int matchCount = 0;
        while (!wordStack.isEmpty()) {
            String word = wordStack.pop();
            if (word.length() >= 4 && word.charAt(1) == 'y' && word.charAt(3) == 'w') {
                System.out.print(word + "; ");
                matchCount++;
            }
        }
        System.out.println("\nTotal matching words found: " + matchCount);

        // Show example of stack now being empty
        System.out.println("\nWord stack is empty after popping all matching words: " + wordStack.isEmpty());
    }
}