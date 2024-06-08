package z32biConsumerExample;

import java.util.function.BiConsumer;

public class Runner {

	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> add = (num1, num2) -> System.out.println(num1+num2);
		add.accept(2,3);
		
		BiConsumer<Integer, Integer> multi = (num1, num2) -> System.out.println(num1*num2);
		multi.accept(2,3);
		System.out.println("====================");
		
		add.andThen(multi).accept(3, 4);
		
		
		
		
	}
}
