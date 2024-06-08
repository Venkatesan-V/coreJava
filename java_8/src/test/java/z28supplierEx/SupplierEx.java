package z28supplierEx;

import java.util.Calendar;
import java.util.function.Supplier;

public class SupplierEx implements Supplier<Object>{

	@Override
	public Object get() {

		Calendar calendar = Calendar.getInstance();
		return calendar.getTime();
	}
	
	public static void main(String[] args) {

		SupplierEx exam=new SupplierEx();
		System.out.println(exam.get());
	}
		
}
