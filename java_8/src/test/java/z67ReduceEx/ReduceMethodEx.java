package z67ReduceEx;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethodEx {

	public static void main(String[] args) {

			List<Integer> numb = Arrays.asList(1,4,7,2,5,8,3,6,9);
// i did not give identity.
			Optional<Integer> result = numb.stream().reduce((sum,element)->sum+element);
			System.out.println(result);
			System.out.println(result.get());
			
//	To find largest number
			Optional<Integer> largestNum = numb.stream().reduce((num1, num2)->Math.max(num1, num2));
			System.out.println("largest number " +largestNum.get());
			
//	To find smallest number
			Optional<Integer> smallestNum = numb.stream().reduce((num1, num2)->Math.min(num1, num2));
			System.out.println("smallest number " +smallestNum.get());
			
//	To find largest number using methodRef
			Optional<Integer> largestNum1 = numb.stream().reduce(Integer::max);
			System.out.println("using MethodRef: largest number " +largestNum1.get());
			
//	To find smallest number using methodRef
			Optional<Integer> smallestNum1 = numb.stream().reduce(Integer::min);
			System.out.println("using MethodRef: smallest number " +smallestNum1.get());
			
//	To get count of Array
			long count = numb.stream().count();
			System.out.println("Count of an Array: " +count);
		
	}
}
