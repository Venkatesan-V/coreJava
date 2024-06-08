package z25predicateExample1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudRunner {

	public static void main(String[] args) {
		
		Student ashok=new Student("ashok", 39.50);
		Student ram=new Student("ram", 38.50);
		Student peter=new Student("peter", 66.50);
//	Method-1
		List<Student> students= new ArrayList<Student>();
		students.add(ashok);
		students.add(ram);
		students.add(peter);
		Predicate<Student> moreThan40= list->list.getPercentage()>40;
		
		for (Student studmore : students) {
			if(moreThan40.test(studmore)) {
				System.out.println(studmore.getName());
			}
		}
		System.out.println("==========Next=========");
//		Method-2
		List<Student> studentList= new ArrayList<Student>();
		studentList.add(new Student("ashok", 39.50));
		studentList.add(new Student("ram", 38.50));
		studentList.add(new Student("peter", 66.50));
		studentList.add(new Student("wills", 35.50));
		studentList.add(new Student("suresh", 31.50));
		
		Predicate<Student> lessThan40= list->list.getPercentage()<40;
		
		for (Student stud : studentList) {
			if(lessThan40.test(stud)) {
				System.out.println(stud.getName());
			}
		}
		
	}
}
