package z24predicateChainingExample;

import java.util.function.Predicate;

public class PredicateChainEx {

//	campus interview select -> yes
//	degree complete -> yes
	
	Predicate<String> campusInterviewSelect;
	Predicate<String> degreeComplete;
	Predicate<Boolean> opposite;
	
	public void andExample() {
		
	campusInterviewSelect=intvwInput->intvwInput.equalsIgnoreCase("yes");
	degreeComplete=degreeInput->degreeInput.equalsIgnoreCase("yes");
	
	System.out.println("Can I join the Company ? " +campusInterviewSelect.and(degreeComplete).test("yes"));
	
	}
	public void orExample() {
		campusInterviewSelect=intvwInput->intvwInput.equalsIgnoreCase("yes");
		degreeComplete=degreeInput->degreeInput.equalsIgnoreCase("no");
		
		System.out.println("Can I join the Company ? " +campusInterviewSelect.or(degreeComplete).test("yes"));
	}
	public void negateExample() {
		opposite=input->input;
		System.out.println(opposite.negate().test(true));

	}
	public static void main(String[] args) {
		
		PredicateChainEx preChain=new PredicateChainEx();
		preChain.andExample();
		preChain.orExample();
		preChain.negateExample();
		
	}
}
