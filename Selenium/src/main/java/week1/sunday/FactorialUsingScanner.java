package week1.sunday;

import java.util.Scanner;

public class FactorialUsingScanner {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter start :");
		int start = scanner.nextInt();

		System.out.println("Enter End :");
		int end = scanner.nextInt();

		for (int i = start; i <=end; i++) {
			System.out.println(i);
			start=start*i;
		}
		System.out.println(start);
}
}