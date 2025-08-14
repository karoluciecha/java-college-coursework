package statics;

public class Currency {
	public static double euroToDollar (double euro) {
		euro = 1.1914447 * euro;
		return  Math.round(euro * Math.pow(10, 2)) / Math.pow(10, 2);
	}
	public static double euroToSterling (double euro) {
		euro = 0.8660 * euro;
		return  Math.round(euro * Math.pow(10, 2)) / Math.pow(10, 2);
	}
	public static double dollarToEuro (double dollar) {
		return 0.8393 * dollar;
	}
	public static double sterlingToEuro (double sterling) {
		return 1.1547 * sterling;
	}
	public static double sterlingToDollar (double sterling) {
		return 1.3748 * sterling;
	}
	public static double dollarToSterling (double dollar) {
		dollar = 0.7274 * dollar;
		return  Math.round(dollar * Math.pow(10, 2)) / Math.pow(10, 2);
	}
}