package Conditional;

public class UseConditionalStatement {

	public static void main(String[] args) {
		int value1 = 10;
		int value2 = 15;
		if(value1>value2){
			System.out.println("value1 is grater");
			if(value1%2==0){
				System.out.println("even nuber");
				
			}else{
				System.out.println("odd");
			}
		}else{
			System.out.println("grater");
			if(value2%2==0){
				System.out.println("even");
			}else{
				System.out.println("odd");
			}
		}
		

	}

}
