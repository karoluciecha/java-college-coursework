package strings;

import java.util.Scanner;

public class ReverseAString {
	// Reverse a string
	static String reverseString(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			result = str.charAt(i) + result;
		}
		return result;
	}
}