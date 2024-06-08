package z34methodReferenceExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class z37ConstructorEx {

	public static void main(String[] args) {
		
		List<String>heroslist = new ArrayList<String>();
		heroslist.add("vijay");
		heroslist.add("ajith");
		heroslist.add("surya");
		heroslist.add("vijay");
//		System.out.println(heroslist);
		
		Set<String> heroSet = new HashSet<String>(heroslist);
//		System.out.println(heroSet);
		
//	using lambda expression
		Function<List<String>, Set<String>> listToSet = (list) -> new HashSet<String>(list);
		System.out.println(listToSet.apply(heroslist));
		
//	convert to method reference
		Function<List<String>, Set<String>> listToSet1 = HashSet::new;
		System.out.println(listToSet1.apply(heroslist));
		
		
	}
}
