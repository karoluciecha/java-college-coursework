package labA;

public class Exercise3 {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Donald");
		Employee emp2 = new Employee("Emma", 33);
		
		System.out.printf("%s, %d\n", emp1.getName(), emp1.getAge());
		System.out.printf("%s, %d\n", emp2.getName(), emp2.getAge());
	}
}