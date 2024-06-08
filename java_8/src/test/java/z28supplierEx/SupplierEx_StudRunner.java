package z28supplierEx;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

import z25predicateExample1.Student;

public class SupplierEx_StudRunner {

	public static void main(String[] args) {
		
		List<SupplierEx_Student> studentList= new ArrayList<SupplierEx_Student>();
		
		studentList.add(new SupplierEx_Student("ashok", 39.50));
		studentList.add(new SupplierEx_Student("ram", 38.50));
		studentList.add(new SupplierEx_Student("peter", 66.50));
		studentList.add(new SupplierEx_Student("wills", 35.50));
		studentList.add(new SupplierEx_Student("suresh", 31.50));
		/*
		Predicate<SupplierEx_Student> lessThan40= list->list.getPercentage()<40;
		
		for (SupplierEx_Student stud : studentList) {
			if(lessThan40.test(stud)) {
				System.out.println(stud.getName());
			}
		}
		*/
//		studentList.forEach(input-> System.out.println(input)); //this will print alphaNumeric address.
//		to solve this prob, we create toString()
		
		Supplier<List<SupplierEx_Student>> studSupp= ()-> studentList;
		
		System.out.println(	studSupp.get());
			
		
		
	}
}
