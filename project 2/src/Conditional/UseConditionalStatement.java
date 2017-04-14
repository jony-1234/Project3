package Conditional;

public class UseConditionalStatement{

	public static void main(String[] args) {
		int value1 = 10;
		int value2 = 15;
		if(value1>value2){
			System.out.println("Value1 is greater than Value2");
			if(value1%2==0){
				System.out.println("And Value1 is even number");
			}else{
				System.out.println("And Value1 is Odd number");
			}
		}else{
			System.out.println("Value2 is greater than Value1");
			if(value2%2==0){
				System.out.println("And Value2 is even number");
			}else{
				System.out.println("And Value2 is Odd number");
			}
		}
	}
}
	
