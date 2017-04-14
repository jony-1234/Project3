package oop.encpsulation;

public class Student {
	
	
	public String name;
	public String dOB;
	public String SSN;
	public String address;
	
	public Student(){
	}
	public Student(String name, String dOB, String sSN, String address) {
		super();
		this.name = name;
		this.dOB = dOB;
		SSN = sSN;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getdOB() {
		return dOB;
	}
	public void setdOB(String dOB) {
		this.dOB = dOB;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
