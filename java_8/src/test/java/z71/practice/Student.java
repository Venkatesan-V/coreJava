package z71.practice;

import java.util.Calendar;
import java.util.function.Supplier;

public class Student {

	public void usingLamda() {
		
	Supplier<Object> supp=()->{
		Calendar calendar=Calendar.getInstance();
		return calendar.getTime();
		};
		System.out.println(supp.get());
		
	}
	public static void main(String[] args) {
		
		Student stud=new Student();
		stud.usingLamda();
	}
	
}