package week3.Assignment;

public class Student {

	public void getStudentInfo(long ID) 
		{
		System.out.println(ID);
		}
	public void getStudentInfo(long ID, String Name) 
		{
		System.out.println(ID  +Name);
		}
	public void getStudentInfo(String email, long phonenumber) 
		{
		System.out.println(email +phonenumber);
		}
	
	public static void main(String[] args) {
		Student obj=new Student();
		obj.getStudentInfo(20231231l);
		obj.getStudentInfo(20231231l, "venkat");
		obj.getStudentInfo("eluththalarvenkat@gmail.com", 9791226672l);
	}
}
