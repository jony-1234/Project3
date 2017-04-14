package Homework5;

import java.util.Scanner;

public class Array {
	public int[] setArray(int limit){
		int[]numberList = new int[limit];
		System.out.println("please enter a number: ");
		Scanner sc = new Scanner(System.in);
		for(int j=0; j<numberList.length; j++){
			numberList[j] = sc.nextInt();
		}
		try{
			if(sc!=null){
				sc.close();
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return numberList;
		
	}
	public void retrieveAray(int[]array){
		for(int i=0; i<array.length; i++)
			System.out.println(array[i]);
	}

}
