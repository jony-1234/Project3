package Array;

import java.util.Scanner;

public class BuildArray {
	public int[] setArray(int limit){
		int[] numberList = new int[limit];
		System.out.println("please enter a number:");
		Scanner sc = new Scanner(System.in);
		for (int j=0; j<numberList.length; j++){
			numberList [j] = sc.nextInt();
			
		}
		return numberList;
		
	}
	public void retriveArray(int[]array){
		for(int i=0; i<array.length; i++)
			System.out.println(array[i]);
		
		}
	}


