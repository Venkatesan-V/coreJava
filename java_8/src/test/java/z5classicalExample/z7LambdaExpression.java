package z5classicalExample;

public class z7LambdaExpression {

//	Example:1
			public void city () {
				System.out.println("Rock City");
			}
			
//			Step1:
//			()->{System.out.println("Rock City");}
//			
//			Step2:
//			()->System.out.println("Rock City");	
			
//	Example:2
	
			public void show(int num1) {
				System.out.println(num1);
			}
//			Step1:
//			(int num1)-> {System.out.println(num1);}
//			
//			Step2:
//			(int num1)-> System.out.println(num1);
//			Step3:
//			(num1)-> System.out.println(num1);
//			num1 -> System.out.println(num1);
			
//	Example:3
			public int findSquare(int num1) {
				return num1*num1;
			}
//			Step3: num1-> {return num1*num1;} return must have { } braces.

}
