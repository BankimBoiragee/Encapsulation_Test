package polymorphism;

public class OverridingTestA {
public void getProperty() {
	System.out.println("From Father");
}
public void getCash() {
	System.out.println("From Grand Father");
}
public void getWife() {
	System.out.println("Wife is Rani");
	
}

public static void main(String[] args) {
	OverridingTestA obj=new OverridingTestA();
	obj.getProperty();
	obj.getCash();
	obj.getWife();
}


}
