package week3.saturday;

public class LearnReverseString {

	public static void main(String[] args) {
		
		String S="venkatesan";
		
		//to print string in reverse
		
		char[] charArray = S.toCharArray();
		
		System.out.println(charArray); //printing as it is
		
		for (int i=charArray.length-1; i>=0; i--) { //printing in reverse but separate lines
				System.out.println(charArray[i]);
				
		}
		for (int i=charArray.length-1; i>=0; i--) { //printing in reverse in same line
				System.out.print(charArray[i]);
		}
		
	}
}
