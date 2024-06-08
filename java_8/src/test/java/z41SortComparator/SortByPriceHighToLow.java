package z41SortComparator;

import java.util.Comparator;

public class SortByPriceHighToLow implements Comparator<MobileTwo> {

	@Override
	public int compare(MobileTwo obj1, MobileTwo obj2) {
		return Integer.compare(obj2.getPrice(),obj1.getPrice());
	}

	
}
