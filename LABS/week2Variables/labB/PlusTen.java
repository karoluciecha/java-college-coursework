// Karol G00436758
public class PlusTen {
    public static void main(String[] args) {
        int number = 8;
        System.out.print(number + " plus " + 10 + " is ");
        number += 10;
        System.out.print(number + "\n");
        for(int i = 10; i <= 100; i += 5) {
            System.out.print(number + " plus " + i + " is ");
            number += 5;
            System.out.print(number + "\n");
        }
    }
}
