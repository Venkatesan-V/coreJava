package z71.practice;

import java.util.function.Function;

public class RunnerUp {

	public void findSquare() {
	Function<Integer, Integer> squares=num-> num*num;
	System.out.println(squares.apply(6));
	}
	
	public void numberOfLetters () {
	Function<String, Integer> numLetter=count-> count.length();
	System.out.println(numLetter.apply("Administration"));
	}
	
	public void convertUpperCase() {
	Function<String, String> upper=	alpha->alpha.toUpperCase();
	System.out.println(upper.apply("abcdefgh"));
	}
	
	public void checkEmpty() {
	Function<String, Boolean> empty= givenStr->givenStr.isEmpty()||givenStr.isBlank()||givenStr.equals("");
	System.out.println(empty.apply(""));
	System.out.println(empty.apply("abcd"));
	}
	
	
	public static void main(String[] args) {
		
		RunnerUp print=new RunnerUp();
		;
		print.numberOfLetters();
		print.convertUpperCase();
		print.checkEmpty();
		
	}
}
