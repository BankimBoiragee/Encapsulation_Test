package polymorphism;

public class OverloadingTest {

	public void getEmpInfo() {
		
	}
public void getEmpInfo(String name) {
	System.out.println("Employee Name:"+name);	
	}
public void getEmpInfo(int age) {
System.out.println("Employee age:"+age);	
}
public void getEmpInfo(String name, int age) {
	System.out.println("Employee Name and Age:"+name +age);
}
public void getEmpInfo(int age, String name) {

	System.out.println("Age and Nameis:"+age +name);
}
public static void main(String[] args) {
	OverloadingTest obj=new OverloadingTest();
	obj.getEmpInfo("Aritra");
	obj.getEmpInfo(5);
	obj.getEmpInfo("Some", 10);
	obj.getEmpInfo(10, "souhardra");
}
}
