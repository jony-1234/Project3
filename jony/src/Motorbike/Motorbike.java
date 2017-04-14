package Motorbike;

public class Motorbike {
	int wheelNumbers = 2;
	String color = "blue";
	int sizeNumber = 30;
	
	
	
	public static void  performance(){
		System.out.println("my Motorbike is Good");
	}
	 public int wheelNumbers(){
		 System.out.println("my Motorbike is:" + wheelNumbers + "wheelNumbers");
		 return wheelNumbers();
	 }
	
	 public String colorofmyMotorbike(){
		 System.out.println("my Motorbike is:"  + color  +"color");
		 return colorofmyMotorbike();
	 }
	 public int sizeNumber(){
		 System.out.println("my Motorbike is:" + sizeNumber + "sizeNumber");
		 return sizeNumber();
		 
	 }
}
