package week1.day1;

public class Student {

		public String studentName() {
		String a = "Ashok";
		return a;
		}
		public int rollno() {
		int b = 2015;
		return b;
		}
		public String collegeName() {
		String c = "Andhra University";	
		return c;
		}
		public int markscored() {
		int d = 99;
		return d;
		}
		public float cgpa() {
		float g = 9.9f;
		return g;
		}
		public static void main (String [] args) {
		
			Student details=new Student ();
			
			String name = details.studentName();
			int rollno = details.rollno();
			String collegeName = details.collegeName();
			int markscored = details.markscored();
			float cgpa = details.cgpa();
			
			System.out.println("Name of Student " +name);
			System.out.println("Student roll no " +rollno);
			System.out.println("Name of the College " +collegeName);
			System.out.println("Marks Obtained " +markscored);
			System.out.println("cgpa obtained " +cgpa);
			
			
			
			
		}
		
	}

