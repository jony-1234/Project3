package JonyLaptop;

public class Laptop {

	int KeypadNumber;
	String ColorName;
	
	public Laptop(String colorName,int keypadNumber){
		
		this.KeypadNumber = keypadNumber;
		this.ColorName = colorName;
		
	}
	
	public void display(){
		System.out.println(ColorName + "     "+ KeypadNumber);
}

	}


