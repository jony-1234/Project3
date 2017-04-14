package JonyHouse;

public class HouseOwner {

	int bedroomNumber;
	String colorName;

	public HouseOwner(String colorName, int bedroomNumber)

	{
		this.colorName = colorName;
		this.bedroomNumber = bedroomNumber;
	}
	public void display(){
		System.out.println("colorName" + "  " + bedroomNumber);
		
	}
	

	}


