package z71.practice;

import java.util.function.Function;

public class Venkat {

	public static void main(String[] args) {
		
	
	Function<Integer, Integer>output= num-> num*num;
	System.out.println(output.apply(8));
	
	
	
	Function<Integer, Integer>outputs = val-> val*val;
	System.out.println(output.apply(9));
	
	

	System.out.println("=========");
	outputs.compose(output);
}
}