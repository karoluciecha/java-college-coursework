package codeSnippets;
class Letter{
	char c;
}
public class PassObject {
	
	static void f(Letter y) {
		y.c='z';
	}
}