package z23predicateExample;

import java.util.function.Predicate;

public class Runner {

	public static void main(String[] args) {
		
		Eligibility elig=new Eligibility();
//		System.out.println(elig.age(19));
		
//	using lambda expression
		Predicate<Integer> eligib =(age)-> age>=18;
		System.out.println(eligib.test(14));
	}
}
