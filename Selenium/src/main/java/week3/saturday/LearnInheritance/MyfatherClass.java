package week3.saturday.LearnInheritance;

public class MyfatherClass extends MygrandfatherClass {

	public void land() {
		System.out.println("1550sqft");
	}
	public static void main(String[] args) {
		MygrandfatherClass use=new MygrandfatherClass();
		use.independentHouse();
		use.flat();
		
	}
	
}
