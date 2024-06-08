package z42SortIntegerOverflow;

import java.util.Comparator;

public class SortByPriceLowToHigh1 implements Comparator<MobileThree> {

	@Override
	public int compare(MobileThree obj1, MobileThree obj2) {
		return obj1.getPrice()-obj2.getPrice(); //chances of gett integer overflow problem when obj1 is negative value
//		return Integer.compare(obj1.getPrice(), obj2.getPrice());
		
	}
}
