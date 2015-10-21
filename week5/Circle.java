import uulib.GUI;

public class Circle {

	public static void main(String[] args)
	{
		final double pi = 3.14;
		double radius = GUI.getDouble("Enter radius");
		double circumference = 2 * radius * pi;
		double area = pi * (radius * radius);
		
		GUI.show("The cirumference = " + circumference);
		GUI.show ("The area = " + area );
	}
}	
