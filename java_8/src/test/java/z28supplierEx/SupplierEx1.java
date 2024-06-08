package z28supplierEx;

import java.util.Calendar;
import java.util.function.Supplier;

public class SupplierEx1 {

	public static void main(String[] args) {
		
//		Method-1 Anonymous way
		
		Supplier<Object> supplier=new Supplier<Object>() {
			@Override
			public Object get() {

				Calendar calendar = Calendar.getInstance();	
				return calendar.getTime();
			}
		};
		System.out.println(supplier.get());
		
//		Method-2 using lambda expression
		/*
		Supplier<Object> supplier=()->{
			Calendar calendar = Calendar.getInstance();	
			return calendar.getTime();
		};
		System.out.println(supplier.get());
		*/
	}
}
