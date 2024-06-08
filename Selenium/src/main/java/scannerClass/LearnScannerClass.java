package scannerClass;

import java.util.Scanner;

public class LearnScannerClass {

	public static void main(String[] args) {
//		The Scanner class is used to get user input, and it is found in the java.util package.
//		To use the Scanner class, create an object of the class and 
//		use any of the available methods found in the Scanner class documentation.
		
		Scanner k1=new Scanner(System.in);
//		System.in helps User to enter input
		
		System.out.println("Enter name: ");
		String uname = k1.nextLine();
		
		System.out.println(uname);
		k1.close();
	}

}
