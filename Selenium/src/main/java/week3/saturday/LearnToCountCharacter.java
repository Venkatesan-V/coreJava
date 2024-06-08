package week3.saturday;

public class LearnToCountCharacter {

	public static void main(String[] args) {

		String word="administration";
		int count=0;
		// to get the count of particular character
		//Method-1
		char[] charArray = word.toCharArray();
		
		for (int i=0; i<=charArray.length-1; i++) {
			if(charArray[i]=='i') {
				count++;
			}
		}
		
		System.out.println("first Count of Char i is " +count);

		//Method-2
		
		int count1=0;
		for (int j=0; j<word.length(); j++) {
			if (word.charAt(j)=='i') {
				count1++;
			}
		}
		System.out.println("Second Count of char i is " +count1);
	}

}
