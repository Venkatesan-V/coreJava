package z17getComfortWithLambda;

public class Runner {

	public void classicWay() {
		Car benz= new Benz();
		benz.start();
	}
	
	public void usingAnonymousWay() {
		Car benz=new Car() {
			
			public void start() {
				System.out.println("started from Runner class");
				}
		};
		benz.start();
	}
//	Func Interface ref can be used to refer lambda expression. [Car benz= ()]
//	func's classicWay() and usingAnonymousClass() are converted to lambda func.
	
	public void usingLambda() {
		Car benz=()-> System.out.println("started from lambda class");
		benz.start();
	}
	
	
	public static void main(String[] args) {
	
	Runner run=new Runner();
	run.classicWay();
	run.usingAnonymousWay();
	run.usingLambda();
		
	}
}
