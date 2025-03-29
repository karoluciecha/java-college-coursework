// Karol G00436758
import java.util.Scanner;
public class LabPolicy {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static void main(String[] args) {
        char attendLab, submitProgram1, submitProgram3, programByDeadline;
        Scanner console = new Scanner(System.in);
        System.out.print("Did you attend lab this week? [y/n]: " + ANSI_GREEN);
        attendLab = console.next().charAt(0);
        if ((attendLab == 'y') || (attendLab == 'Y')) {
            System.out.print(ANSI_RESET + "Did you submit program 1 to D2L? [y/n]: " + ANSI_GREEN);
            submitProgram1 = console.next().charAt(0);
            if ((submitProgram1 == 'y') || (submitProgram1 == 'Y')) {
                System.out.print(ANSI_RESET + "Did you submit the program by the deadline? [y/n]: " + ANSI_GREEN);
                programByDeadline = console.next().charAt(0);
                if ((programByDeadline == 'y') || (programByDeadline == 'Y')) {
                    System.out.println(ANSI_RESET + "\nCongratulations! You fulfilled your lab obligations for this week.");
                } else if ((programByDeadline == 'n') || (programByDeadline == 'N')) {
                    System.out.println(ANSI_RESET + "\nSorry, you did not fultill your lab obligations for the week.\nPlease try to get your program submitted on time in the future!");
                } else {
                    System.out.println(ANSI_RESET + "\nNot a valid input! Try again.");
                }
            } else if ((submitProgram1 == 'n') || (submitProgram1 == 'N')) {
                System.out.println(ANSI_RESET + "\nSorry, you did not fultill your lab obligations for the week.\nPlease try to get your program submitted on time in the future!");
            } else {
                    System.out.println(ANSI_RESET + "\nNot a valid input! Try again.");
                }
        } else if ((attendLab == 'n') || (attendLab == 'N')) {
            System.out.print(ANSI_RESET + "Did you submit program 3 to D2L? [y/n]: " + ANSI_GREEN);
            submitProgram3 = console.next().charAt(0);
            if ((submitProgram3 == 'y') || (submitProgram3 == 'Y')) {
                System.out.print(ANSI_RESET + "Did you submit the program by the deadline? [y/n]: " + ANSI_GREEN);
                programByDeadline = console.next().charAt(0);
                if ((programByDeadline == 'y') || (programByDeadline == 'Y')) {
                    System.out.println(ANSI_RESET + "\nCongratulations! You fulfilled your lab obligations for this week.");
                } else if ((programByDeadline == 'n') || (programByDeadline == 'N')) {
                    System.out.println(ANSI_RESET + "\nSorry, you did not fultill your lab obligations for the week.\nPlease try to get your program submitted on time in the future!");
                } else {
                    System.out.println(ANSI_RESET + "\nNot a valid input! Try again.");
                }
            } else if ((submitProgram3 == 'n') || (submitProgram3 == 'N')) {
                System.out.println(ANSI_RESET + "\nSorry, you did not fultill your lab obligations for the week.\nPlease try to get your program submitted on time in the future!");
            } else {
                    System.out.println(ANSI_RESET + "\nNot a valid input! Try again.");
                }
        } else {
            System.out.println(ANSI_RESET + "\nNot a valid input! Try again.");
        }
        
        console.close();
    }
}