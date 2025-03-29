// Karol G00436758
public class Exercise7 {
    public static void main(String[] args) {
        char fizzBuzz[] = {'F', 'i', 'z', 'z', 'B', 'u', 'z', 'z'};
        for (int i = 1; i < 21; i++) {
            switch (i) {
                case 3:
                    for (int j = 0; j <= i; j++) {
                        System.out.printf("%c", fizzBuzz[j]);
                    }
                    System.out.printf("\n");
                    break;
                case 5:
                    for (int j = (i - 1); j < fizzBuzz.length; j++) {
                        System.out.printf("%c", fizzBuzz[j]);
                    }
                    System.out.printf("\n");
                    break;
                case 15:
                    for (int j = 0; j < fizzBuzz.length; j++) {
                        System.out.printf("%c", fizzBuzz[j]);
                    }
                    System.out.printf("\n");
                    break;
                default:
                    System.out.printf("%d\n", i);
                    break;
            }
        }
    }
}