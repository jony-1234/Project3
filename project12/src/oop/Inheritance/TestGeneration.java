package oop.Inheritance;

public class TestGeneration {

	public static void main(String[] args) {
		Adam am = new Adam();
		System.out.println(am.HairColor);
		System.out.println(am.height);
		
		People pl = new People();
		pl.hobby();
		pl.getHeight();
		pl.getColor();
		

	}

}
