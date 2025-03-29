import java.util.Scanner;

public class JavaTheRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] runners = new String[3];
        int[] times = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter runner " + (i + 1) + " name: ");
            runners[i] = scanner.nextLine();
            System.out.print("Enter runner " + (i + 1) + " time (in minutes): ");
            times[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();

        // Sort the runners and times in ascending order of time
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - i; j++) {
                if (times[j] > times[j + 1]) {
                    int tempTime = times[j];
                    times[j] = times[j + 1];
                    times[j + 1] = tempTime;
                    String tempName = runners[j];
                    runners[j] = runners[j + 1];
                    runners[j + 1] = tempName;
                }
            }
        }

        System.out.println("\n\n----------------------------------\n\n");
        System.out.println(runners[0] + " was the winner!");
        System.out.println(runners[1] + " was second!");
        System.out.println(runners[2] + " was third!");
    }
}
