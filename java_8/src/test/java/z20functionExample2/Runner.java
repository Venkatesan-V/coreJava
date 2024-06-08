package z20functionExample2;

import java.util.function.Function;

public class Runner {
	
	public void usingLambda() {
		Function<String, String> askRock=question->"This World";
		
		System.out.println(askRock.apply("What you want ?"));
	}

	public static void main(String[] args) {
		
		RockyBhai roc=new RockyBhai(); // without lambda func
		String answer = roc.chachaAsk("What you want ?");
		System.out.println(answer);
		
		Runner run=new Runner();
		run.usingLambda();
		
		
	}
}
