package week3sunday.learnCollection;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		//Need to import list&arraylist from util classes
		 
		//syntax 
		List<String> listName=new ArrayList<String>();
		//List--> interface
		//<> --> generic
		//String--> wrapper class (integer, float, boolean)
		//listName--> obj used to call implementation methods of ArrayList provided in implementation class (List)
		//ArrayList--> ICICI, SBI (Go to Execution class for example) implementation method(Constructor)
		
		// For Integer
		List<Integer> intlist=new ArrayList<Integer>();
		
		
		listName.add("Apple");
		listName.add("Bravo");
		listName.add("Copper");
		System.out.println(listName);
	
		//To retrieve the data from the list
		System.out.println(listName.get(2));
		
		// To find the size of the list
		System.out.println(listName.size());
		
		//To find particular name presence--> boolean output
		System.out.println(listName.contains("bravo")); //case sensitive
		System.out.println(listName.contains("Bravo"));
		
		//To add a data into particular Index
				System.out.println(listName.set(1, "bahubali"));
				System.out.println(listName);
				
		// For all type of data--> Another Method
				List<Object> allTypeOfData=new ArrayList<Object>();
				allTypeOfData.addAll(listName);
				System.out.println(allTypeOfData);
				
		// To remove any particular data from the list
				listName.remove(1);
				System.out.println(listName);
				allTypeOfData.remove(0);
				System.out.println(allTypeOfData);
		// To add a data to the list
				System.out.println(allTypeOfData.add("Delta")); //returns boolean value
				System.out.println(allTypeOfData); // returns with Delta
		// To remove all data from the list
				allTypeOfData.removeAll(listName); // removes all data from listName
				System.out.println(allTypeOfData); // prints only allTypeOfData
		// To remove
				allTypeOfData.remove(0);
				System.out.println(allTypeOfData);
				System.out.println(allTypeOfData.isEmpty()); // boolean output
		// To clear
				listName.clear();
				System.out.println(listName);
			
				List<String> newlist=new ArrayList<String>();
				newlist.add("One");
				newlist.add("Two");
				newlist.add("Three");
				newlist.add("Four");
				newlist.add("Five");
				
				System.out.println(newlist.toArray());
				
	}	

}
