package exams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

//Define the superclass Person
class Person {
 private String name;
 private String contactInfo;
 private static double personCount = 0;

 public Person(String name, String contactInfo) {
		if (personCount >= 40) {
			System.out.printf("Maximum capacity exceeded. Flights can only accommodate 40 persons on board.");
		}
		else {
			this.name = name;
			this.contactInfo = contactInfo;
			personCount++;
		}

 }

 public String getName() {
     return name;
 }

 public String getContactInfo() {
     return contactInfo;
 }

 public void setName(String name) {
		this.name = name;
 }

 public void setContactInfo(String contactInfo) {
     this.contactInfo = contactInfo;
 }

 @Override
 public String toString() {
     return "Name: " + name + ", Contact: " + contactInfo;
 }
}

//Define the subclass FlightCrew
class FlightCrew extends Person {
 private String role;
 private String employeeID;
 private static String captainName;
 private static int captainQuantity = 0;
 private static int cocaptainQuantity = 0;
 private static int faQuantity = 0;
 private static int crewQuantity = 0;

 public FlightCrew(String name, String contactInfo, String role, String employeeID) {
		super(name, contactInfo);
     if (role.equalsIgnoreCase("pilot")) {
			if (captainQuantity == 0) {
			    captainName = name;
			    this.role = role;
     		this.employeeID = employeeID;
     		captainQuantity++;
     		crewQuantity++;
			}
			else {
				System.out.println("Captain already assigned. Crew member has role changed to co-pilot.");
			    this.role = "co-pilot";
     		this.employeeID = employeeID;
     		cocaptainQuantity++;
     		crewQuantity++;
			}
		}
		else {
			this.role = role;
			if (role.equalsIgnoreCase("co-pilot")) cocaptainQuantity++;
			if (role.equalsIgnoreCase("flight attendant")) faQuantity++;
			this.employeeID = employeeID;
			crewQuantity++;
		}

 }

	public static String crewReport() {
		String res = "";
		if (captainQuantity == 1) res += String.format("Captain: %s\n", captainName);
		if (cocaptainQuantity > 0) res += String.format("Co-Pilots: %d\n", cocaptainQuantity);
		if (faQuantity > 0) res += String.format("Attendants: %d", faQuantity);
		return res;
	}

 public String getRole() {
     return role;
 }

 public String getEmployeeID() {
     return employeeID;
 }

 public void setRole(String role) {
		this.role = role;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

 @Override
 public String toString() {
     return super.toString() + ", Role: " + role + ", ID: " + employeeID;
 }
}

//Define the subclass Passenger
class Passenger extends Person {
 private String passportNumber;
 private String seatPreference;
 private boolean confirmed;
 private char FARE;
 private static int passengerCount = 0;
 private static int noEconomy = 0;
 private static int noPremium = 0;
 private static final double ECONOMY_PRICE = 100;
 private static final double PREMIUM_PRICE = 180;
 private static double totalRevenue = 0;

 public Passenger(String name, String contactInfo, String passportNumber, String seatPreference, char FARE) {
     super(name, contactInfo);
     this.passportNumber = passportNumber;
     this.seatPreference = seatPreference;
     this.FARE = FARE;
     if (FARE == 'e' || FARE == 'E') {
			noEconomy++;
			totalRevenue += ECONOMY_PRICE;
		}
     if (FARE == 'p' || FARE == 'P') {
			noPremium++;
			totalRevenue += PREMIUM_PRICE;
		}
 }

 public void statusChange() {
		confirmed = false;
		passengerCount--;
		if (FARE == 'e' || FARE == 'E') {
			noEconomy--;
			totalRevenue -= ECONOMY_PRICE;
		}
     if (FARE == 'p' || FARE == 'P') {
			noPremium--;
			totalRevenue -= PREMIUM_PRICE;
		}
	}

	public String getPassportNumber() {
     return passportNumber;
 }

 public String getSeatPreference() {
     return seatPreference;
 }

 public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public void setSeatPreference(String seatPreference) {
		this.seatPreference = seatPreference;
	}

 @Override
 public String toString() {
		if (FARE == 'e' || FARE == 'E') return super.toString() + ", Passport: " + passportNumber + ", Seat Preference: " + seatPreference + ", Fare: ECONOMY";
		return super.toString() + ", Passport: " + passportNumber + ", Seat Preference: " + seatPreference + ", Fare: PREMIUM";
 }
}

public class ExamTwo {

	private static void exerciseOne(Scanner console) {
		Random rand = new Random();
		int rand57 = rand.nextInt(21) + 50;
		int[] firstArray = new int[20];
		int[] secondArray = new int[20];
		int j = 0;

		System.out.println("The first array contains:");
		for (int i = 0; i < 20; i++) {
			firstArray[i] = rand57++;
			System.out.printf("%d ", firstArray[i]);
		}

		System.out.println("\n\nThe second array contains:");
		while (j < 20) {
			for (int i = 10; i < 20; i++) {
				secondArray[j] = firstArray[i];
				j++;
			}
			for (int i = 0; i < 10; i++) {
				secondArray[j] = firstArray[i];
				j++;
			}
		}

		for (int i = 0; i < 20; i++) System.out.printf("%d ", secondArray[i]);
		System.out.println();
	}

	private static void exerciseTwo(Scanner console) throws FileNotFoundException {
		String[][] citiesPopulation = new String[2][48];
        int i = 0;
        File myFile = new File("src/exams/cities.txt");
        Scanner inputFile = new Scanner(myFile);

        while (inputFile.hasNext()) {
			citiesPopulation[0][i] = inputFile.next();
			citiesPopulation[1][i] = inputFile.next();
			i++;
		}
        inputFile.close();
        i = 0;
        while(true) {
			System.out.printf("City Search Menu:\n1. Search by population range\n2. Search for a specific city\n3. Exit\nEnter your choice: ");
			i = console.nextInt();
			if (i == 1) {
				double min, max;
				System.out.printf("Enter minimum population (in millions): ");
				min = console.nextDouble();
				System.out.printf("Enter maximum population (in millions): ");
				max = console.nextDouble();
				while (min > max) {
					System.out.printf("Enter maximum population (in millions): ");
					max = console.nextDouble();
				}
				System.out.printf("Cities with population between %.2f and %.2f million:\n", min, max);
				for (int j = 0; j < 48; j++) {
					if ((Double.parseDouble(citiesPopulation[1][j]) >= min) && (Double.parseDouble(citiesPopulation[1][j]) <= max)) {
						System.out.printf("%s: %s million\n", citiesPopulation[0][j], citiesPopulation[1][j]);
					}
				}
				System.out.println();
			}
			else if (i == 2) {
				System.out.printf("Enter city name to search for: ");
				String city = console.next();
				console.nextLine();
				for (int j = 0; j < 48; j++) {
					if (city.equalsIgnoreCase(citiesPopulation[0][j])) {
						System.out.printf("%s: %s million\n", citiesPopulation[0][j], citiesPopulation[1][j]);
						break;
					}
				}
			}
			else if (i == 3) break;
		}
    }
	
	private static void exerciseThree(Scanner console) {
		// Create Passenger objects
        Passenger passenger1 = new Passenger("John Doe", "john.doe@email.com", "A123456", "Window", 'E');
        System.out.println(passenger1.toString());
        Passenger passenger2 = new Passenger("Sarah Smith", "sarah@email.com", "B789012", "Aisle", 'P');
        System.out.println(passenger2.toString());
        Passenger passenger3 = new Passenger("Alex Johnson", "alex@email.com", "C567890", "Middle", 'E');
        System.out.println(passenger3.toString());

        // Create FlightCrew objects
        FlightCrew crew1 = new FlightCrew("Captain Miller", "miller@airline.com", "Pilot", "EMP001");
        System.out.println(crew1.toString());
		FlightCrew crew2 = new FlightCrew("Jane Wilson", "jane.w@airline.com", "Flight Attendant", "EMP002");
		System.out.println(crew2.toString());
        FlightCrew crew3 = new FlightCrew("Mark Thompson", "mark@airline.com", "Flight Attendant", "EMP003");
        System.out.println(crew3.toString());
        FlightCrew crew4 = new FlightCrew("Captain Morrison", "morrison@airline.com", "Pilot", "EMP004");
        System.out.println(crew4.toString());
	}
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== Exercise 1 =====");
		exerciseOne(scanner);

		System.out.println("\n===== Exercise 2 =====");
		exerciseTwo(scanner);
		
		System.out.println("\n===== Exercise 3 =====");
		exerciseThree(scanner);

		scanner.close();
	}
}
