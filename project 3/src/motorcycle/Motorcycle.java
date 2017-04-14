package motorcycle;

public class Motorcycle {

	int Wheels = 2;
	String color = "Black";
	String name = "Honda";

	public static void performance() {
		System.out.println("My motorcycle is good");
	}

	public int WheelNumber() {
		System.out.println("My motorcycle is" + Wheels + "Wheels");
		return Wheels;

	}

	public String colorofmymotorcycle() {
		System.out.println("My motorcycle is" + color + "color");
		return color;

	}

	public String getColor() {
		System.out.println("The color of my car is: " + color);
		return color;

	}

	public String getname() {
		System.out.println("The class of my motorcycle is: " + name);
		return name;
	}
}
