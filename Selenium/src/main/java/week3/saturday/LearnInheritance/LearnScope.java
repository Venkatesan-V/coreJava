package week3.saturday.LearnInheritance;

public class LearnScope extends LearnAccessspecifier {

	public static void main(String[] args) {
		
		LearnScope s=new LearnScope();
		s.m1();
		s.m2();
		//m3 is missing because it is private, does not visible to other class
		s.m4();
	}
}
