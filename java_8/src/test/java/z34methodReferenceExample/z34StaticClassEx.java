package z34methodReferenceExample;

@FunctionalInterface
interface Iadd {
	public void add (int num1, int num2);
}

public class z34StaticClassEx {

//	here method (sum & main) does the same action, in order to simplify, i am asking to refer method sum.
	
	public static void sum(int val1, int val2) {
		System.out.println(val1+val2);
	}
	
	public static void main(String[] args) {
		
//		Iadd iAdd = (num1, num2) -> System.out.println(num1+num2);
//		iAdd.add(2, 3);
		
		z34StaticClassEx.sum(3, 6);
		
		Iadd iAdd = z34StaticClassEx::sum;
		iAdd.add(7,8);
	}
}
