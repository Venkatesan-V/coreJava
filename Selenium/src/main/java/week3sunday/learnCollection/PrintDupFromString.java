package week3sunday.learnCollection;

public class PrintDupFromString {

	public static void main(String[] args) {
		
		String str="administration";
		int count;
		
		char[] charArray = str.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			count=1;
			for (int j = i+1; j < charArray.length; j++) {
				if(charArray[i]==charArray[j]) {
					count++;
					charArray[j]=0;
				}
			}
			if(count>1) {
//			System.out.println(charArray[i]);
		}
		}
	}
}
		
		
	

