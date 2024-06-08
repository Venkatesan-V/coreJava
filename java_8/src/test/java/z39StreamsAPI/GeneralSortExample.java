package z39StreamsAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneralSortExample {

	
	public static void main(String[] args) {

		List<String> superHero = new ArrayList<String>();
		superHero.add("Batman");
		superHero.add("Superman");
		superHero.add("WonderWoman");
		superHero.add("IronMan");

		for (String supHero : superHero) {
//			System.out.println(supHero);
		}
		Collections.sort(superHero);
		System.err.println("-------------------------");

		for (String supHeroo : superHero) {
			System.out.println(supHeroo);
		}
	}
}
