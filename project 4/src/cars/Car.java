package cars;

public class Car {
	int wheels = 4;
	String color = "green";

	public void runsFast() {
		System.out.println("My car runs fast!");

	}

	
	public int wheelNumber() {
		System.out.println("My car has " + wheels+  " wheels");
		return wheels;

	}
	
	
	public String colorOfMyCar() {
		System.out.println("My car has " + color+  " color");
		return color;

	}
}
