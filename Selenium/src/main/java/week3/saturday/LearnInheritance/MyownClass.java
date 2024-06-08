package week3.saturday.LearnInheritance;

public class MyownClass extends MyfatherClass {

	public void noProp () {
		System.out.println("empty hand");
	}
	public static void main(String[] args) {
		MyfatherClass occupy=new MyfatherClass();
		occupy.independentHouse();
		occupy.flat();
		occupy.land();
	}
}
