import uulib.GUI;

public class Rectangle 
{
	public static void main(String[] args)
	{	
		int length, breadth;
		int perimeter;
		int area;

		length = GUI.getInt("Enter length");
		breadth = GUI.getInt("Enter breadth");

		perimeter = (2 * breadth) + (2 * length);
		area = length * breadth;

		GUI.show("Area: " + area + "\nPerimeter: " + perimeter);
	}
}	
		
	
	
		
		



		
