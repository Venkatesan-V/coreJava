package z21functionExample3;

import java.util.function.Function;

public class MoreFuncExamples {

	public void findSquare() {
		Function<Integer, Integer> square=input->input*input;
		System.out.println(square.apply(3));
	}

	public void countTheLetters() {
		Function<String, Integer> length= givenString->givenString.length();
		System.out.println(length.apply("MISSILE"));
	}
	
	public void convertUpperCase() {
		Function<String, String> uppCase= inputString->inputString.toUpperCase();
		System.out.println(uppCase.apply("abdul kalam"));
	}
	public void checkEmpty() {
		Function<String, Boolean> empty = inputString->inputString.isEmpty() 
						||inputString.isBlank() || inputString.equals("");
		System.out.println(empty.apply(""));
		System.out.println(empty.apply("Humayun"));
	}
	
	public static void main(String[] args) {
		MoreFuncExamples run= new MoreFuncExamples();
		run.findSquare();
		run.countTheLetters();
		run.convertUpperCase();
		run.checkEmpty();

	}
}
