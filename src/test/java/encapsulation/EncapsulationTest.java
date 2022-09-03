package encapsulation;

public class EncapsulationTest {
private String name="Sourav";
public String getName() {
	return name;
}
private int age=35;
public int getAge() {
	return age;
}
//public void setName(String name) {
	//this.name = name;
//}
//public void setAge(int age) {
	//this.age = age;
//}

public static void main(String[] args) {
	EncapsulationTest obj=new EncapsulationTest();
	obj.getName();
	obj.getAge();
	System.out.println("Name:  "+obj.name);
	System.out.println("Age is: "+obj.age);  //Age is here concatenation.
	
	
	
}
}
