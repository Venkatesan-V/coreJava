package week3.saturday;

public class LearnStringMethod {

	public static void main(String[] args) {
		
		int x=10;
	// String value can be alpha, numb
		String s="10";
		
	//to calculate number of characters
		String name="TestLeaf Institute"; //Space is counted
		
		int length = name.length();
		System.out.println(length);
		//System.out.println(name.length()); also print 18
		
		char charAt = name.charAt(5);
		System.out.println(name.charAt(5)); //index starts with 0
		char charAt2 = name.charAt(8);
		System.out.println(charAt2+ "SPACE");

		//converting to lowercase and uppercase
		String lowerCase = name.toLowerCase();
		String upperCase = name.toUpperCase();
		
		System.out.println(lowerCase);
		System.out.println(upperCase);
		
		//To replace any character with any value
		
		String leadid="100045Testleaf";
		leadid.replace("l", "L");
		System.out.println(leadid.replace("l", "L"));
		
		leadid.replaceAll("\\d", "");  //(\\d prints String) ("") means null, removes numbers
		leadid.replaceAll("\\D", "");  //(\\D prints number)
		System.out.println(leadid.replaceAll("\\d", ""));
		System.out.println(leadid.replaceAll("\\D", ""));
		
		System.out.println("Another way");
		//Another way
		String leadname = leadid.replaceAll("[0-9]", ""); 	//for the Word
		System.out.println(leadid.replaceAll("[0-9]", ""));
		
		String leadname1 = leadid.replaceAll("[^0-9]", ""); 	//for numbers cap sign
		System.out.println(leadname1 +"leadName");			//two ways we can execute
		
		//To add some value to the leadid - convert string to Integer
		String leadnum = leadid.replaceAll("\\D", "");
		int parseInt = Integer.parseInt(leadnum);
		System.out.println(parseInt+12);
		
		//To replace selective characters
		String fruit="OranGe";
		String noVowels = fruit.replaceAll("[aeiouAEIOU]", "&");
		System.out.println(noVowels);
		String withVowels = fruit.replaceAll("[^aeiouAEIOU]", "#");
		System.out.println(withVowels);
		
		//To print/ get any char seq from a particular index
		String mail="VenkatEvershine";
		
		String substring = mail.substring(6);	//Method 1
		System.out.println(substring);
		String substring1 = mail.substring(0); 	//Method 2
		System.out.println(substring1);
		String substring2 = mail.substring(0, 6); //Method 3
		System.out.println(substring2);
		String substring3 = mail.substring(1, 9); //Method 4
		System.out.println(substring3);
		
		String echo= "InterviewBit Technologies Private Limited";
		String target= "Private";
		String replace= "Pvt";
		
		String replace2 = name.replace(target, replace);
		System.out.println(replace2);
		
		
	}

}
