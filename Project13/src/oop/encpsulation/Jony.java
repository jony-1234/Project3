package oop.encpsulation;

public class Jony {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setName("jony");
		s1.setdOB("02-27-1989");
		s1.setSSN("123-345-567");
		s1.setAddress("106-27,156th street,jamaica ny 11433");
		System.out.println(s1.getName()+"  "+s1.getdOB()+"   "+s1.getSSN()+"   "+s1.getAddress());
		Student s2 = new Student("jony","02-27-1989","123-345-567","106-27,156th street,jamaica ny 11433");
		System.out.println(s2.getName()+"  "+s2.getdOB()+"   "+s2.getSSN()+"   "+s2.getAddress());

	}

}
