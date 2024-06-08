package z33otherFuncInterfaceEx;

import java.util.function.Predicate;

public class Runner {

	public static void main(String[] args) {
		
		Eligibility eligibility = new Eligibility();
		System.out.println("first class " +eligibility.age(17));
		
		Predicate<Integer> eligible  = (age) -> age>=18;
		System.out.println("second class " +eligible.test(25));
		
		//Integer -> int (unwrapping) auto unboxing/ unboxing
		// int -> Integer (wrapping)  auto boxing
		
		
	}
}
