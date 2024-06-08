package learnExceptionHandling;

public class LearnConstructor {

		int x;
		String name;
		public LearnConstructor() {
			System.out.println("I am from No argument constructor");
		}
	
		public LearnConstructor (int a, String name) {
			this();
			this.name=name; // this helps to call venkat to global variable
			System.out.println("I am from parametrized argument constructor" +a +"-->" +name);
		}
		
		public LearnConstructor (String s, String name) {
			this(7, "monisha");
			this.name=name; // this helps to call venkat to global variable
			System.out.println("I am from parametrized argument constructor" +s +"-->" +name);
		}
		
	public static void main(String[] args) {
		LearnConstructor obj= new LearnConstructor(); //default constructor
		LearnConstructor obj1= new LearnConstructor("Emp", "venkat");
				System.out.println(obj.x);
				System.out.println(obj1.name);
		}
	}


