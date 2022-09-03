package comnyencaplulation;

public class EncapsulationTest {

	private String CourseName="SDET";
	public String getCourseName() {
		return CourseName;
	}
	
	private int CourseFee=5000;
	public int getCourseFee() {
		return CourseFee;
	}
	
	public static void main(String[] args) {
	
		EncapsulationTest obj= new EncapsulationTest();
		obj.getCourseName();
		obj.getCourseFee();
		System.out.println("Course is SDET:"+obj.getCourseName());
		System.out.println("Course Fee is:"+obj.getCourseFee());
		
	}
}
