package week1.sunday;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		
		int[] number= {2,9,8,6,5,4,7};
		int numb[]= {9,5,8,6,4,1,2,3,5,6};
		
		System.out.println("Length of the value");
		
		int length1=number.length;
		int length2=numb.length;
		
		System.out.println(length1);
		System.out.println(length2);
		
		System.out.println("Picking");
		
		System.out.println(number[4]);
		System.out.println(numb[5]);
		
		System.out.println("Ascending order");
		
		Arrays.sort(number);
		for (int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
		System.out.println("Descend order");
		Arrays.sort(numb);
		for (int k=numb.length-1; k>=0; k--) {
			System.out.println(numb[k]);
		}
		System.out.println("Largest number " +number[number.length-1]);
			
		System.out.println("Smallest number " +number[0]);
		
	}

}
