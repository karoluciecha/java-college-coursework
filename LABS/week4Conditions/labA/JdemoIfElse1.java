// Karol G00436758
public class JdemoIfElse1 {
    public static void main(String[] args) {
        int a = 20, b = 30, c = 3;
        if (a > 10) {
            System.out.println("A greater than 10\n");
        }
        if (a > b) {
            System.out.println("A greater than B\n");
        }
        else {
            System.out.println("A less than B\n");
        }

        if (a == b) {
            System.out.println("A euals B\n");
        } else if (a > b) {
            System.out.println("A greater than B\n");
        } else {
            System.out.println("A less than B\n");
        }

        if ((a == 1) && (b == 2) && (c == 3)) {
            System.out.println("a is 1, b is 2, c is 3 (with And &&)");
        } else {
            System.out.println("Not: a is 1, b is 2, c is 3 (with And &&)");
        }
    }
}