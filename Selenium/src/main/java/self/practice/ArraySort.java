package self.practice;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
	
		int[] arr= {8,5,6,9,7,4,1,2,3};
//printing all numbers of array
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
//printing all numbers of array
		System.out.println("Reversed array");
		for (int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
		System.out.println("After sorting");
		
		Arrays.sort(arr);
//printing in ascending order
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
	}
//printing largest and smallest number
		System.out.println("largest number in the array ");
		System.out.println(arr[8]);
		System.out.println("smallest number in the array ");
		System.out.println(arr[0]);
		
		System.out.println("Descending array number");
		for (int j=arr.length-1;j>=0;j--) {
			System.out.println(arr[j]);
		}
	}
}
