import uulib.GUI;

public class Circle {
	public static void main(String[] args) {
	
		double circumference;
		double radius = 4;
		circumference = 3.14 * radius * 2;
		double area;
		area = 3.14 * (radius * radius);

		GUI.show("Area: " + area + "\nCircumference: " + circumference);
	}
}
