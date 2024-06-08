package week3.saturday.LearnInheritance;

public class LearnMethodOverriding extends LearnMethodOverloading {
	
	public void add (int x, int y) { //green triangle specifies perfect overridden, empty triangle specifies as Overridden
		System.out.println(x+y);
	}
	public void add () {
		System.out.println("Working on addition factor from child class");
	}

	public static void main(String[] args) {
		
		LearnMethodOverriding override=new LearnMethodOverriding();
		override.add(5, 4);
		override.add();

	}

}
