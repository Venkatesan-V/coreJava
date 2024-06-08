package week1.day1;

public class Report {

	public static void main(String[] args) {
		
		Student qualification=new Student();
		
		String studentName=		qualification.studentName();
		int rollno= 			qualification.rollno();
		String collegeName= 	qualification.collegeName();
		int markscored= 		qualification.markscored();
		float cgpa= 			qualification.cgpa();
		
		
		System.out.println("Name of the Student " +studentName);
		System.out.println("Enter the Roll number " +rollno);
		System.out.println("Name of the College " +collegeName);
		System.out.println("Marks Scored " +markscored);
		System.out.println("cgpa " +cgpa);
	
	}

}
