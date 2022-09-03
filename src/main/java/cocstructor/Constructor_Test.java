package cocstructor;

public class Constructor_Test {
	
	Constructor_Test(int age){
		System.out.println("His age is:"+age);
	}
	Constructor_Test(String name){
		System.out.println("His Name is:"+name);
	}
	public static void main(String[] args) {
		Constructor_Test obj=new Constructor_Test(10);
		Constructor_Test obj1=new Constructor_Test("Souhardra");

	}

}
