package self.practice;

public class StringConcept {

	public static void main(String[] args) {
		
		String input="LearningString";
		char[] charArray = input.toCharArray();
		for (int i=charArray.length-1;i>=0;i--) 
		{
			System.out.print(charArray[i]);
			
		}
	}

}
