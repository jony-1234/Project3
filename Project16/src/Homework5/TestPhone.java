package Homework5;

import java.util.Scanner;

public class TestPhone {

	public static void main(String[] args) {
		Iphone7 i7 = new Iphone7();
		i7.homeButton();
		i7.camera();
		i7.camera10pixel();
		i7.camera8pixel();
		i7.color();
		i7.Iphonerunbyfingerprint();
		i7.Iphonerunbytapticengine();
		i7.manualOperate();
		
		Iphone6 i6 = new Iphone7();
		i6.Iphonerunbyfingerprint();
		i6.camera8pixel();
		i6.camera();
		i6.color();
		i6.manualOperate();
		i6.homeButton();
		
		Iphone7 i7con = new Iphone7();
		i7con.setName("Jony7");
		i7con.setLockNumber("123456");
		i7con.setPromotionyear(2017);
		i7con.setStoreaddress("484-48-197th street,queens blvd");
		System.out.println(i7con.getName()+"  " +i7con.getLockNumber()+" " +i7con.getPromotionyear()+"  "+i7con.getStoreaddress());
		Iphone7 i7con1 = new Iphone7(1,"jony7","484-48-197th street,queens blvd","123456",2017);
		System.out.println(i7con1.getName()+"  " +i7con1.getLockNumber()+" " +i7con1.getPromotionyear()+"  "+i7con1.getStoreaddress());
       
		Iphone7 i7con2 = new Iphone7();
		int sizeofIphoneinline = i7con2.sizeofIphone(5, 10);
		System.out.println(sizeofIphoneinline);
		int sizeofIphoneintriangle = i7con2.sizeofIphone(5, 10, 15);
		System.out.println(sizeofIphoneintriangle);
		int sizeofIphoneinrectangular = i7con2.sizeofIphone(5, 10, 15, 20);
		System.out.println(sizeofIphoneinrectangular);
		
		
		WeekTodo wt = new WeekTodo();
		wt.tellLikeItIs(Week.THIRD);
		wt.tellLikeItIs(Week.SIXTH);
		wt.tellLikeItIs(Week.SECOND);
		
		Reader rd = new Reader();
		rd.ReadeProgram();
		
		Array ar = new Array();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter you array limit: ");
		int limit = sc.nextInt();
		int [] array = ar.setArray(limit);
		ar.retrieveAray(array);
		try{
			if(sc!=null){
				sc.close();
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
		
		
	
		
	}

}

