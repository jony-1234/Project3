package oop.polymorphism;

public class TestComputer {

	public static void main(String[] args) {
		AnalogComputer ac = new AnalogComputer();
		int resultofline = ac.areaoftable(5, 15);
		System.out.println(resultofline);
		int resultoftriangle = ac.areaoftable(5, 15, 20);
		System.out.println(resultoftriangle);
		int resultofrectangular = ac.areaoftable(5, 15, 20, 25);
		System.out.println(resultofrectangular);
		
		
		

	}

}
