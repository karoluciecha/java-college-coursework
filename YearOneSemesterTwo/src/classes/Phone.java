package classes;

public class Phone {
	private String name;
	private double price;
	private int stock;
	
	public void setName(String nm) {
		name = nm;
	}
	public void setPrice(double pr) {
		price = pr;
	}
	public void setStock(int st) {
		stock = st;
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getStock() {
		return stock;
	}
}