package week3sunday.learnCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnToConvertArrayToList {

	public static void main(String[] args) {
		
		Integer[] numbers= {1,5,9,7,8,6,2};
		List<Integer> numlist=new LinkedList<Integer>();
		numlist.addAll(Arrays.asList(numbers));
			System.out.println(numlist);
		
			int[] num= {12,22,32,42,5,6,2,82};
	//Using forloop
		for(int i=0; i<=num.length-1;i++) {		
			numlist.add(num[i]);
		}
			System.out.println(numlist);
	
	// To sort a List
			Collections.sort(numlist);
//			System.out.println(numlist);
	/*
	// To find Duplicates -- Method 1-- index method
		for (int j=0; j<numlist.size()-1;j++) {
			if (numlist.get(j)== numlist.get(j+1)) { //In List, use get, arr[i]
			System.out.println(numlist.get(j));
			}
		} */
		
		//Method-2 for interview purpose--alternate way
		// To remove duplicates - high level
			
		List<Integer>duplist= new ArrayList<Integer>();
	//Using for-each loop
		for(Integer value:numlist) {					
			if(!duplist.contains(value)) {
				duplist.add(value);
			}
		}
//			System.out.println(duplist);
		
			
	}
}


