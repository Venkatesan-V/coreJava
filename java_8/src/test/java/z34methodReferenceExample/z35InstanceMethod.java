package z34methodReferenceExample;

@FunctionalInterface
interface Iwelcome {
	public void welcome(String name);
}

public class z35InstanceMethod {

	public void greet(String name) {
		System.out.println("welcome "+name);
	}
	
	public static void main(String[] args) {
//		m-1
//		Iwelcome iWelcome = (name) -> {System.out.println("welcome " +name);};
//		iWelcome.welcome("venkat");
//		m-2
		z35InstanceMethod meth= new z35InstanceMethod();
		Iwelcome iwelco = meth::greet;
		iwelco.welcome("tarantino");
	}
}
