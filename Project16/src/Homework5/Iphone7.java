package Homework5;

public class Iphone7 extends Iphone6 {
	public int homeButton = 1;
	
	private String name;
	private String storeaddress;
	private String lockNumber;
	private int promotionyear;
	
	
	
	
	public Iphone7(int homeButton, String name, String storeaddress, String lockNumber, int promotionyear) {
		super();
		this.homeButton = homeButton;
		this.name = name;
		this.storeaddress = storeaddress;
		this.lockNumber = lockNumber;
		this.promotionyear = promotionyear;
	}


	
 
	public Iphone7(){
	
	}
		
		public int getHomeButton() {
			return homeButton;
		}

		public void setHomeButton(int homeButton) {
			this.homeButton = homeButton;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStoreaddress() {
			return storeaddress;
		}

		public void setStoreaddress(String storeaddress) {
			this.storeaddress = storeaddress;
		}

		public String getLockNumber() {
			return lockNumber;
		}

		public void setLockNumber(String lockNumber) {
			this.lockNumber = lockNumber;
		}

		public int getPromotionyear() {
			return promotionyear;
		}

		public void setPromotionyear(int promotionyear) {
			this.promotionyear = promotionyear;
		}



		public void Iphonerunbytapticengine(){
			System.out.println("in iphone7 new features is added like Tapticengine");
		}
		
		public void camera10pixel(){
			System.out.println("in iphone7 new features is added like camera10pixel");

}

		
		public int homeButton() {
			System.out.println("Iphone5 has 1 home button");
			return homeButton;
		}

		
		public void color() {
			System.out.println("the new color of iphone is black");
			
		}

		
		public void manualOperate() {
			System.out.println("iphone5 operate manually like home button");
			
		}

		
		public void camera() {
			System.out.println("iphone5 has 6pixel");
			
		}

		
		public void camera8pixel() {
			System.out.println("iphone6 has 8pixel camera");
			
		}



		@Override
		public int a() {
			int a = 5;
			return a;
		}




		@Override
		public int b() {
			int b = 10;
			return b;
		}




		@Override
		public int c() {
			int c = 15;
			return c;
		}




		@Override
		public int d() {
			int d = 20;
			return d;
		}




		@Override
		public int sizeofIphone(int a,int b) {
			int total = a + b + 2;
			return total;
		}




		@Override
		public int sizeofIphone(int a,int b,int c) {
			int total = a + b + c + 4;
			return total;
		}




		@Override
		public int sizeofIphone(int a,int b,int c,int d) {
			int total = a + b + c + d + 6;
			return total;
		}




		@Override
		public int sizeofIphone() {
			
			return 0;
		}




		
}

	