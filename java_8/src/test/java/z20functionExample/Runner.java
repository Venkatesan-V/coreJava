package z20functionExample;

import java.util.function.Function;

public class Runner {

	public void usingLambdaStyle() {
		Function<Integer, Double> convert= usd->usd*81.50;

		System.out.println(convert.apply(10));
	}
	
	public void anonymousClass() {
		
		Function<Integer, Double> usdToinr = new Function<Integer, Double>() {
			public Double apply(Integer usd) {
				return usd*81.5;
			}
		};
		System.out.println(usdToinr.apply(12));
	}



	public static void main(String[] args) {


		UsdToInr run= new UsdToInr();
		Runner runn=new Runner();
		
		System.out.println(run.usdToINR(10));
		
		runn.usingLambdaStyle();
		runn.anonymousClass();
	}
}
