package z71.practice;

public class RunnerUp {

	public void usingClassicalWay() {
		Fruits fruit=new John();
		System.out.println(fruit.apple(12, 13));
	}

	public void usingAnonymousWay() {
		Fruits fruit=new Fruits() {
			public int apple (int num1, int num2) {
				return num1+num2;
			}
		};
		System.out.println(fruit.apple(14, 15));
	}

	public void usingLambda() {
		Fruits fruit=(num1, num2)->num1+num2;
		System.out.println(fruit.apple(16, 17));
	}

	public static void main(String[] args) {

		RunnerUp runUp=new RunnerUp();

		runUp.usingClassicalWay();
		runUp.usingAnonymousWay();
		runUp.usingLambda();

	}
}
