package z15staticMethodExample;

public class MercedesBenz implements CarFormula {

	public static void start() {
		System.out.println("Started from MercedesBenz Interface Statice Method");
	}
	
	
	public static void main(String[] args) {
		
		MercedesBenz benz= new MercedesBenz();
		CarFormula benz1= new MercedesBenz();
		
//		benz.start(); // this method is not callable since it is static
//		benz1.start(); // this method is not callable since it is static
//		CarFormula.start(); // only possible way.
//		MercedesBenz.start(); // this method is not callable since it is static
		
//		
		MercedesBenz.start(); // this 'start' comes from MercedesBenz and not from CarFormula
	}
}
