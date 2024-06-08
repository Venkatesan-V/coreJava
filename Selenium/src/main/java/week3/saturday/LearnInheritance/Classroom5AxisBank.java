package week3.saturday.LearnInheritance;

public class Classroom5AxisBank extends Classroom5BankInfo{

	public void deposits() {
		System.out.println("i have 40lacs in axis deposits");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classroom5AxisBank dep=new Classroom5AxisBank();
		dep.savings();
		dep.deposits();
		dep.fixed();
	}
}
