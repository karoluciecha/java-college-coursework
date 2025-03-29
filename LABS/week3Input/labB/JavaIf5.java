// Karol G00436758
public class JavaIf5 {
    public static void main(String[] args) {
        int age = 17;
        System.out.println("If you are " + age + " years old . . . You are:");
        if (age < 13) {
            System.out.println("\ttoo young to create a Facebook account");
        } else {
            System.out.println("\told enough to create a Facebook account");
        }
        if (age < 16) {
            System.out.println("\ttoo young to get a driver's license");
        } else {
            System.out.println("\told enough to get a driver's license");
        }
        if (age < 18) {
            System.out.println("\ttoo young to vote");
            System.out.println("\ttoo young to buy alcohol");
        } else {
            System.out.println("\told enough to vote");
            System.out.println("\told enough to buy alcohol");
        }
        if (age < 21) {
            System.out.println("\ttoo young to become a T.D");
        } else {
            System.out.println("\told enough to become a T.D");
        }
        if (age > 50) {
            System.out.println("\tgetting old");
        } else {
            System.out.println("\tstill young");
        }
    }
}