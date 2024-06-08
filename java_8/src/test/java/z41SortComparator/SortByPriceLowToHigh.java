package z41SortComparator;

import java.util.Comparator;

public class SortByPriceLowToHigh implements Comparator<MobileTwo>{

	@Override
	public int compare(MobileTwo obj1, MobileTwo obj2) {
//		return obj1.getPrice()-obj2.getPrice(); chances of gett integer overflow problem when obj1 is negative value
		return Integer.compare(obj1.getPrice(), obj2.getPrice());
		
	}

}
