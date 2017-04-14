package oop.abstraction;

public class TestDrive extends SemiCar {
        
         
	public static void main(String[] args) {
		TestDrive Toyota = new TestDrive();
		Toyota.electricvehicle();
		Toyota.enginebyFuel();
		Toyota.start();
		
		SemiCar Toyota1 = new TestDrive();
		Toyota1.electricvehicle();
		
		
		
		
		

	}
	
	

	
	public void start() {
		System.out.println("engine start the car");
		
	}

	
	public void manualBreak() {
		System.out.println("Break can stop the car");
		
	}

	
	public void wheel() {
	System.out.println("wheel help to runs the car");
		
	}

	
	public void electricvehicle() {
	 System.out.println("electricity help to start the vehicle");
		
	}

}
