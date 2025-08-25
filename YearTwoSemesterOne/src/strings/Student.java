package strings;

public class Student {
	String studentName;
	int number;

	public Student(String name, int no) {
		studentName = name;
		number = no;
	}

	@Override // to - ctrl + space
	public String toString() {
		return ("Name is: " + studentName + "\nStudent number is: " + number);
	}
}