package z26consumerEx;

import java.util.function.Consumer;

public class ConsumerEx implements Consumer<String>{

	@Override
	public void accept(String input) {
		System.out.println(input);
	}
	
	
	
	public static void main(String[] args) {
		
		ConsumerEx example=new ConsumerEx();
		example.accept("welcome, ajith kumar");
	}
}
