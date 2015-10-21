public class CalcVat {
	public static void main(String[] args) {
	
	double price = 67;
	double vat = 17.5;

	System.out.println("The price is £" + price + " and the VAT rate is " + vat + "%");
	double vat_price;
	vat_price = price * (vat / 100);

	System.out.println("The amount paid in vat is £" + vat_price);


	}
}
