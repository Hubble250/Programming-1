import uulib.GUI;

public class CalcVat2 {
	public static void main(String[] args) {
	
	double price = GUI.getInt("Enter the price");
	final double vat = 20.0;

	GUI.show("The price is " + price + " and the VAT rate is " + vat + "%");
	double vat_price;
	vat_price = price * (vat / 100);

	GUI.show("The amount paid in vat is " + vat_price);


	}
}
