package Motorbike;

public class ElectricBike extends Motorbike1{
	public ElectricBike(){
		System.out.println("this is the object of ElectricBike");
	}
	public ElectricBike(String Bikemodel,int year){
		super(Bikemodel,year);
		
	}
	public void getBikeinfo(){
		System.out.println("this is a BMW Bike");
	}

}
