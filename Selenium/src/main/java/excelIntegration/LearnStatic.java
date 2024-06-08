package excelIntegration;

public class LearnStatic {

	public static void method1() {
		System.out.println("From static method");
	}
	public void method2() {
		System.out.println("From normal method");
	}
	
	public static void main(String[] args) {
		
		method1(); // method1 is accepted when we have static.
		
		LearnStatic obj=new LearnStatic();
		obj.method2(); // method2 is not accepted because of static absense so create an object.
		// Need to create an object to call method2.
	
	}
}
