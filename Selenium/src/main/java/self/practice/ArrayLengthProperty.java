package self.practice;

public class ArrayLengthProperty {

	public static void main(String[] args) {
		
		int [] number= {12,15,19,89,56,45,63};
		int numb[]= {74,84,64,34,24};
		
		int length1 = number.length;
		int length2 = numb.length;
		
		//to know the length of an array
		System.out.println(length1);
		System.out.println(length2);
		
		String [] name= {"one","two","third","four","five"};
		int length3 = name.length;
		System.out.println(length3);
		
		//to pick particular number from array
		System.out.println(name[3]);
		
		//to print complete number from array
		for(int i=0;i<length1;i++) {
		System.out.println(number[i]);
		}
	}

}
