package z33otherFuncInterfaceEx;

import java.util.function.IntPredicate;

public class IntPredicateExample {

	public static void main(String[] args) {

// This class overcomes confusion between autoBoxing and auto Unboxing.		
		
		IntPredicate eligible = (age) -> age>=18;
		
		System.out.println(eligible.test(17));
		
	}
}
