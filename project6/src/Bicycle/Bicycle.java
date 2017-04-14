package Bicycle;

public class Bicycle {
	int wheelNumber ;
	String colorName = "Black";
	static int mile = 10;
	//static Method1 ( variable must be static & no object is needed)
	public static int  performance() {
		System.out.println("My Bicycle runs "+ mile + " mile per hour");
		return mile;
		
	}
	//regular method2( void not need to return & object is needed)
	public void colorofmyBicycle(){
		System.out.println("My Bicycle color is " + colorName  );
		
	}
	//default constructor
	public Bicycle(){
		
	}
	//regular constructor(object is needed)
	public Bicycle(int wheelNumber, int mile){
		this.wheelNumber = wheelNumber;
		this.mile = mile;
		System.out.println("My Bicycle wheelNumber is: "+  this.wheelNumber);
		System.out.println("My Bicycle runs " + this.mile +  " mile per hour");
		
		
	}
	

	

	

}
