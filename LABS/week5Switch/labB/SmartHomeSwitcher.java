// Karol G00436758
import java.util.Scanner;
public class SmartHomeSwitcher {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int choiceI = 0;
        char choiceC;
        do {
            System.out.printf("Select a component to control:\n1: Lights\n2: Thermostat\n3: Music Player\n4: Locks\n5: Security System\nEnter your choice: ");
            choiceI = console.nextInt();
        } while ((choiceI < 1) || (choiceI > 5));
        System.out.printf("Would you like to:\n");
        switch (choiceI) {
            case 1:
                do {
                    System.out.printf("A: Turn ON\nB: Turn OFF\nEnter your choice: ");
                    choiceC = console.next().charAt(0);
                    choiceC = Character.toUpperCase(choiceC);
                } while ((choiceC != 'A') && (choiceC != 'B'));
                switch (choiceC) {
                    case 'A':
                        System.out.printf("The lights are now ON.\n\n");
                        break;
                    case 'B':
                        System.out.printf("The lights are now OFF.\n\n");
                        break;
                }
                break;
            case 2:
                do {
                    System.out.printf("A: Increase temperature\nB: Decrease temperature\nEnter your choice: ");
                    choiceC = console.next().charAt(0);
                    choiceC = Character.toUpperCase(choiceC);
                } while ((choiceC != 'A') && (choiceC != 'B'));
                switch (choiceC) {
                    case 'A':
                        System.out.printf("Temperature increased.\n\n");
                        break;
                    case 'B':
                        System.out.printf("Temperature decreased.\n\n");
                        break;
                }
                break;
            case 3:
                do {
                    System.out.printf("A: Play music\nB: Pause music\nEnter your choice: ");
                    choiceC = console.next().charAt(0);
                    choiceC = Character.toUpperCase(choiceC);
                } while ((choiceC != 'A') && (choiceC != 'B'));
                switch (choiceC) {
                    case 'A':
                        System.out.printf("Music is playing.\n\n");
                        break;
                    case 'B':
                        System.out.printf("Music is paused.\n\n");
                        break;
                }
                break;
            case 4:
                do {
                    System.out.printf("A: Lock\nB: Unlock\nEnter your choice: ");
                    choiceC = console.next().charAt(0);
                    choiceC = Character.toUpperCase(choiceC);
                } while ((choiceC != 'A') && (choiceC != 'B'));
                switch (choiceC) {
                    case 'A':
                        System.out.printf("Locks are now locked.\n\n");
                        break;
                    case 'B':
                        System.out.printf("Locks are now unlocked.\n\n");
                        break;
                }
                break;
                case 5:
                    do {
                        System.out.printf("A: Activate\nB: Deactivate\nEnter your choice: ");
                        choiceC = console.next().charAt(0);
                        choiceC = Character.toUpperCase(choiceC);
                    } while ((choiceC != 'A') && (choiceC != 'B'));
                    switch (choiceC) {
                        case 'A':
                            System.out.printf("Security system activated.\n\n");
                            break;
                        case 'B':
                            System.out.printf("Security system deactivated.\n\n");
                            break;
                    }
                    break;
        }
        console.close();
    }
}