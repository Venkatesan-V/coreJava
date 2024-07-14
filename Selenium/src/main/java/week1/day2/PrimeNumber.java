package week1.day2;

public class PrimeNumber {

	
	public static void main(String[] args) {

		int num=88;
		boolean isprime= true;
		
		for (int i=2;i<=num/2;i++) {
//			System.out.println(i);
			
			if (num%i==0) {
				isprime=false;
				break;
			}
			
		}
		if (isprime) {
			System.out.println(num +" is prime number");
		}
		else {
				System.out.println(num +" is not prime number");
			}
		
		}
	}

	





