package polymorphism;

public class OverridingTestB extends OverridingTestA {

	public void getWife() {
		System.out.println("Wife is Bani");
		
	}
	public void getCar() {
		System.out.println("BMW");
	}
	
	public static void main(String[] args) {
		OverridingTestB obj=new OverridingTestB();
		obj.getProperty();
		obj.getCash();
		obj.getWife();
		obj.getCar();
	}
	
	
}
