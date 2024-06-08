package z26consumerEx;

import java.util.function.Consumer;

public class ConsumerEx1 {

	public void anonymousClass() {

		Consumer<String> printThis = new Consumer<String>() {

			public void accept(String input) {
				System.out.println(input);

			}
		};
		printThis.accept("welcome, kamalhassan");
	}

	public void usingLambda() {
		Consumer<String> consumer1 = (input)->System.out.println(input);
		consumer1.accept("welcome, chris nolan");

	}

	public void usingLambdas() {
		Consumer<String> consumer1 = (input)->System.out.println(input + " is a word");
		//		consumer1.accept("welcome, chris nolan");

		Consumer<String> consumer2 = (input)->System.out.println(input + " is an emotion");
		//		consumer2.accept("welcome, martin scorsese");

		consumer1.andThen(consumer2).accept("welcome");
	}

	public static void main(String[] args) {

		ConsumerEx1 exm=new ConsumerEx1();
		exm.anonymousClass();
		exm.usingLambda();
		exm.usingLambdas();

	}
}

