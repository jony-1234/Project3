package Bicycle1;

public class Bicycle1 {

	int wheelNumber;
	String colorName = "Blue";
	static int mile;
	
	
	
	public static int performance(){
	System.out.println("my Bicycle run"  + mile  + "per hour");
	return mile;
	
}
	public void colorofmyBicycle1(){
		System.out.println("color of my Bicycle" + colorName);
	}
	public Bicycle1(){
	
		
	}
	public Bicycle1(int wheelNumber,int mile){
		this.wheelNumber = wheelNumber;
		this.mile = mile;
		System.out.println("my Bicycle1 wheelNumber is: " + wheelNumber);
		System.out.println("my Bicycle1 run   " + mile + " mile per hour");
		
	}
	

	


}
