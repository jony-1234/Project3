package variablesdemo;

public class ClassTest {
	
	int classNumber;
	String className;



public ClassTest(String className, int classNumber){
	this.classNumber = classNumber;
	this.className = className;
		}

public void display(){
	System.out.println(className  + "    "           + classNumber);
}



}
