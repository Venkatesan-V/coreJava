package z66ReduceEx;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceWithoutIdentity {

	public static void main(String[] args) {

		List<Integer> numb = Arrays.asList(1,4,7,2,5,8,3,6,9);
// i did not give identity.
		Optional<Integer> result = numb.stream().reduce((sum,element)->sum+element);
		System.out.println(result);
		System.out.println(result.get());
	}
}