package Array;

import java.util.Scanner;

public class UseArray {

	public static void main(String[] args) {
		BuildArray build = new BuildArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("plase");
		int limit = sc.nextInt();
		int []array = build.setArray(limit);
		build.retrieveArray(array);

	}

}
