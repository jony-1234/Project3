package Nested;

public class Outter {


	public static void OutterMethodAmain() {
		System.out.println("this is outer method A");
		InnerA.innerMethodA();
		InnerB.innerMethodB(InnerA.num);
		
		
		

	}
	private static class InnerA{
		private static int num = 10;
		private static void innerMethodA(){
			System.out.println("this is inner method A");
		}
		
	}
	private static class InnerB{
		private static void innerMethodB(int num){
			System.out.println("this is inner method B:  "+ num);
		}
	}

}
