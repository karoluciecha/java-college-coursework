package fileToArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EverythingOne {

    private static void exerciseOne() throws FileNotFoundException {
        String filename = "src/fileToArray/numbers.txt";
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        int[] nums = new int[5];
        for (int i = 0; i < nums.length && inputFile.hasNextInt(); i++) {
            nums[i] = inputFile.nextInt();
            System.out.printf("%d\n", nums[i]);
        }
        inputFile.close();
    }

    private static void exerciseTwo() throws FileNotFoundException {
        String filename = "src/fileToArray/myfile.txt";
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        ArrayList<String> namesList = new ArrayList<>();
        while (inputFile.hasNext()) {
            namesList.add(inputFile.next());
        }
        inputFile.close();

        for (String name : namesList) {
            System.out.printf("%s\n", name);
        }
    }

    private static void exerciseThree(Scanner console) throws FileNotFoundException {
        String[][] countriesCapitals = new String[2][196];
        File countriesFile = new File("src/fileToArray/countries.txt");
        File capitalsFile = new File("src/fileToArray/capitals.txt");

        Scanner countriesScanner = new Scanner(countriesFile);
        Scanner capitalsScanner = new Scanner(capitalsFile);

        for (int i = 0; i < countriesCapitals[0].length && countriesScanner.hasNextLine() && capitalsScanner.hasNextLine(); i++) {
            countriesCapitals[0][i] = countriesScanner.nextLine();
            countriesCapitals[1][i] = capitalsScanner.nextLine();
        }
        countriesScanner.close();
        capitalsScanner.close();

        System.out.println("-----------------------------------------------------");
        System.out.println("---------- Country and Capital City Search ----------");
        System.out.println("-----------------------------------------------------");

        while (true) {
            int choiceI = choiceECC(console);
            if (choiceI == 0) break;
            String choiceC = choiceCCN(choiceI, countriesCapitals, console);
            answer(choiceI, choiceC, countriesCapitals);
        }
    }

    private static int choiceECC(Scanner console) {
        int choiceI = -1;
        boolean valid = false;

        while (!valid) {
            System.out.print("\nEnter:\n0 to exit\n1 to search by country\n2 to search by city\nChoice: ");
            try {
                choiceI = console.nextInt();
                console.nextLine();
                if (choiceI >= 0 && choiceI <= 2) {
                    valid = true;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            } catch (Exception e) {
                console.nextLine();
                System.out.println("Invalid input. Please try again.");
            }
        }
        return choiceI;
    }

    private static String choiceCCN(int choiceI, String[][] countriesCapitals, Scanner console) {
        String choiceC = "";
        boolean check = false;

        while (!check) {
            System.out.printf("Enter %s name: ", (choiceI == 1 ? "country" : "capital"));
            choiceC = console.nextLine();

            StringBuilder result = new StringBuilder(choiceC.length());
            String[] words = choiceC.split("\\s");
            for (int i = 0; i < words.length; i++) {
                if (i > 0) result.append(" ");
                result.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1).toLowerCase());
            }
            choiceC = result.toString();

            boolean found = false;
            for (int i = 0; i < countriesCapitals[choiceI - 1].length; i++) {
                if (choiceC.equals(countriesCapitals[choiceI - 1][i])) {
                    found = true;
                    break;
                }
            }
            if (found) {
                check = true;
            } else {
                System.out.printf("%s not found on the list. Please try again.\n", (choiceI == 1 ? "Country" : "Capital"));
            }
        }
        return choiceC;
    }

    private static void answer(int choiceI, String choiceC, String[][] countriesCapitals) {
        for (int i = 0; i < countriesCapitals[0].length; i++) {
            if (choiceC.equals(countriesCapitals[choiceI - 1][i])) {
                if (choiceI == 1) {
                    System.out.printf("The capital of %s is %s.\n", choiceC, countriesCapitals[1][i]);
                } else {
                    System.out.printf("%s is the capital of %s\n", choiceC, countriesCapitals[0][i]);
                }
                return;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Exercise 1 =====");
        exerciseOne();

        System.out.println("\n===== Exercise 2 =====");
        exerciseTwo();

        System.out.println("\n===== Exercise 3 =====");
        exerciseThree(scanner);

        scanner.close();
    }
}