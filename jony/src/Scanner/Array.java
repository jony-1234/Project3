package Scanner;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	
		int[] numberList = new int [70];
		
		for(int i = 0; i<numberList.length; i++){
			System.out.println("Please enter your value");
			numberList[i] = sc.nextInt();
			
		}
}
}



