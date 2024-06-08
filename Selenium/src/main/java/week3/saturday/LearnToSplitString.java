package week3.saturday;

public class LearnToSplitString {

	public static void main(String[] args) {
		
	// converting String into an Array using forloop
		
		String intro="My name is venkat";
		String word="administration";
		
		String[] split = intro.split(" ");   //ctrl+2L (" ")-->delimiter, divides
		String[] split2 = word.split("i");
		
		for (int i=0; i<=split.length-1; i++) {
			System.out.println(split[i]);	
		}
		
		System.out.println("=======================");
		
		for (int i=0; i<=split2.length-1; i++) { //(SPLIT happens wherever i present, i is removed)
			System.out.println(split2[i]);
		}
		System.out.println("=======================");  //empty line
	// Reversing the String split
		
		for (int i=split.length-1; i>=0; i--) {
			System.out.print(split[i]);   //printing in same line
		}
		System.out.println("=======================");  //empty line
		
		for (int i=split2.length-1; i>=0; i--) {
			System.out.print(split2[i]);    //printing in same line
		}
	}
}
