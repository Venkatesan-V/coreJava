package week3.saturday;

public class LearnString {

	public static void main(String[] args) {
		//literal way
		String s ="Testleaf"; 
	
		//instance way
		String s1 =new String ("testleaf"); 
		
	// to check how the values placed in memory
		if(s==s1) {
			System.out.println("Both strings are placed in same memory address");
		}
		else {
			System.out.println("Both strings are placed in different memory");
		}
		
	//to compare the values of string
		if(s.equals(s1)) {
			System.out.println("String values are same");
		}
		else {
			System.out.println("String values are different");
		}
	// to ignore the cases of the string values
				if(s.equalsIgnoreCase(s1)) {
					System.out.println("String values are same");
				}
				else {
					System.out.println("String values are different");
				}
				
	//to match/check the part of the value present in the String
				boolean contains=s.contains("leaf");
				System.out.println(contains);
	
	}

}
