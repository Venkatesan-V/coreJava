package week3.saturday.LearnInheritance;

public class LearnMethodOverloading {

	public void add (int x, int y) {
		System.out.println(x+y);
	}
	public void add () {
		System.out.println("Working on addition factor");
	}
	public void add (String s, int z) {
		System.out.println(s+z);
	}
	public void add (int z, String s) {
		System.out.println(z+s);
	}
	
	public static void main(String[] args) {
		
		LearnMethodOverloading overload=new LearnMethodOverloading();
		overload.add(5, 3);
		overload.add();
		overload.add("second", 8);
		overload.add(6, "first");
		
		//same class--same methodName--diff argument is accessible
		

	}

}
