package oop.abstraction;

public class Test extends Robot {

	public static void main(String[] args) {
		Test jony = new Test();
		jony.electricman();
		jony.manrunbyenergy();
		jony.manualeat();
		jony.run();
		jony.walk();
		
		Robot jony1 = new Test();
		jony1.electricman();
		jony1.manrunbyenergy();
	
	

	}

	
	public void electricman() {
	System.out.println("robot run by electricity");
		
	}

	public void run() {
		System.out.println("man can run");
			

	}
	public void walk() {
		System.out.println("man can walk");
	
	}
	
	public void manualeat() {
		System.out.println("man can eat");
		
	}
}
			
			


