package laptop1;

public class Laptop {
	
	int keypadNumber;
	String colorName;
	int sizeNumber;

	
	
  
	public Laptop(int keypadNumber, String colorName, int sizeNumber){
		
		this.keypadNumber = keypadNumber;
		this.colorName = colorName;
		this.sizeNumber = sizeNumber;
		
	

	}

	public void display(){
		System.out.println(colorName + "   " + keypadNumber + sizeNumber);
	}
	
	
}
