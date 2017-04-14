package oop.Inheritance;

public class TestGeneration {

	public static void main(String[] args) {
		
		Father f1 = new Father();
		System.out.println(f1.getHaircolor());
	
		System.out.println(f1.getheight());
		System.out.println(f1.getweight());
		
		Son s1 = new Son();
		s1.hobbyBadmintonskills();
		s1.getheight();
		s1.getHaircolor();
		
		

	}

}
