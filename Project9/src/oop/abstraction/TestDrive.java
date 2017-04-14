package oop.abstraction;

public class TestDrive extends SemiMotorBike {

	public static void main(String[] args) {
		TestDrive BMW = new TestDrive();
		BMW.MotorBikerunbyoil();
		BMW.electricmotorbike();

		SemiMotorBike BMW1 = new TestDrive();
		BMW1.MotorBikerunbyoil();
		BMW1.electricmotorbike();
		
		
		
	

	}


	public void electricmotorbike() {
		System.out.println("my motorbike run by electricity");
		
		
	}

}
