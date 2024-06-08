package z64ReduceExample;

import java.util.Arrays;
import java.util.List;

public class SimpleArrayAddition {

	public static void main(String[] args) {
		
		List<Integer> numb = Arrays.asList(1,2,3,4,5,6,7);
		int sum=0;
		for (Integer add : numb) {
			sum+=add;
		}
		System.out.println(sum);
	}
}
