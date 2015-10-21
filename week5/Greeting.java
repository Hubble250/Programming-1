import uulib.GUI;

public class Greeting {
	
	public static void main(String[] args) {
		
		String name = GUI.getString("Enter you name");

		GUI.show("Hello " + name + ", nice to meet you!");
	}
}
