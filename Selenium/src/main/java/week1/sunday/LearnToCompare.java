package week1.sunday;

public class LearnToCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= {2,4,6,3,2,6};
		
//find the duplicates in the array
		
		for(int i=0; i<num.length; i++) { //outer loop
			for (int j=i+1; j<num.length; j++) { //inner loop
				if (num[i]==num[j]) {
					System.out.println("The duplicate values " + num[i]);
				}
			}
		}
		
		
		
	}

}
