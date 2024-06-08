package learnExceptionHandling;

public class LearnCheckedException {


	// throw
	public static void num (int n1, int n2) // throws InterupptedException
	{
		if (n1>n2) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				System.out.println(e);
			}
			System.out.println(n1-n2);
		}
		else {
			throw new RuntimeException ("Invalid input");
		}
	}
	public static void main(String[] args) {

		num(10,5);
	}

}
