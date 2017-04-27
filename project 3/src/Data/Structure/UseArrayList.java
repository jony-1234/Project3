package Data.Structure;

import java.util.ArrayList;
import java.util.Scanner;

public class UseArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		for(int i=0; i<5; i++){
			list.add(sc.nextInt());
		}
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		try{
			if(sc!=null){
				sc.close();
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
