package week3sunday.learnCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// Need to import Set class from util
		
	// Implementation-1
		Set<String> setName=new HashSet<String>();
		
		setName.add("One");
		setName.add("One");
		setName.add("Two");
		setName.add("Three");
		setName.add("Four");
		
		System.out.println(setName);
		
	// Implementation-2
			Set<String> setValues=new LinkedHashSet<String>(setName);
			System.out.println(setValues);
		
	// Implementation-3
			Set<String> setVal=new TreeSet<String>(setName);
			System.out.println(setVal);
		
	// High level- To remove duplicates
			//Example:1
			int[] num= {2,3,3,4,5,6,6,7,8,8};
			Set<Integer> numSet=new LinkedHashSet<Integer>();
			for (int i=0;i<=num.length-1;i++) {
			numSet.add(num[i]);
		}
		System.out.println(numSet);
	
			//Example:2
			String g="google";
			
			char[] charArray = g.toCharArray();
			
			Set<Character> charSet=new TreeSet<Character>();
			
			for (int i=0; i<=charArray.length-1;i++) {
				charSet.add(charArray[i]);
			}
			
			System.out.println(charSet);
	
	
	
	
	
	
	
	
	
	
	
	}
}
