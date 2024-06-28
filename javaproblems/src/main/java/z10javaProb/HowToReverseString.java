package z10javaProb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class HowToReverseString {

	public void usingStringBuffer() {
		String name="environment";
		StringBuffer buffer=new StringBuffer();
		buffer.append(name);
		System.out.println(buffer.reverse());
	}

	public void usingForLoop() {
		String name1 ="administration";
		String reversed = "";
		char[] charArr = name1.toCharArray();
		for(int i=charArr.length-1; i>=0; i--) {
			reversed=reversed+charArr[i];
		}
		System.out.println(reversed);
	}
	
	public void usingCollections() {
		String name2 ="corporation";
		char[] charArr = name2.toCharArray();
		List<Character> listname=new ArrayList<Character>();
		
		for (Character listword : charArr) {
			listname.add(listword);
		}
		Collections.reverse(listname);
//		System.out.println(listname);
		
		ListIterator iterator = listname.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String[] args) {

		HowToReverseString hRevStr=new HowToReverseString();
		hRevStr.usingStringBuffer();
		hRevStr.usingForLoop();
		hRevStr.usingCollections();
		



	}
}