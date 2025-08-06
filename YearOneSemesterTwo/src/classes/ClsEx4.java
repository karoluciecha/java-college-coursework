package classes;

public class ClsEx4 {
	private String name;
	private double priceC;
	private double priceR;
	
	public void setName(String nm) {
		name = nm;
	}
	public void setPriceC(double prc) {
		priceC = prc;
	}
	public void retailPrice() {
		priceR = priceC + (priceC * 0.45);
	}
	
	public String getName() {
		return name;
	}
	public double getPriceC() {
		return priceC;
	}
	public double getPriceR() {
		return priceR;
	}
}