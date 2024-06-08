package week1.sunday;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter start :");
		int start = scanner.nextInt();

		System.out.println("Enter End :");
		int end = scanner.nextInt();

		for (int i = start; i <=end; i++) {
			if (i%2==0) {
				System.out.println("even " +i);
			}else {
				System.out.println("odd " +i);
			}
		}

	}
}
