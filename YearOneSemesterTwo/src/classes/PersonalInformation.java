package classes;

public class PersonalInformation {
	private String name;
	private String address;
	private String phone;
	private int age;
	
	public void setName(String n) {
		name = n;
	}
	public void setAge(int a) {
		age = a;
	}
	public void setAddress(String a) {
		address = a;
	}
	public void setPhone(String p) {
		phone = p;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
}