package week1.day2;

import java.util.Scanner;

public class PrimeNumberBetweenTwoIntervals {

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);

		System.out.println("Enter Start num: ");
		int start = scanner.nextInt();

		System.out.println("Enter End num: ");
		int end = scanner.nextInt();

		for(int i=start; i<=end;i++) {
			
			boolean isprime= true;

				for (int j=2;j<=i/2;j++) {
					if (i%j==0) {
						isprime=false;
						break;
					}
				}
					if (isprime) {
						System.out.println(i +" is prime number");
					}
					else {
						System.out.println(i +" is not prime number");
					}
				}

	}
}
