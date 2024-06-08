package z14dMwMI;

public class ChildClass implements IFather, IMother {

//	Multiple Inheritance is not possible. Need to decide choice explicitly. Either choose from interface or have own func.
	
	public void joinCollege() {
//		System.out.println("i will decide on my own");
		IMother.super.joinCollege();
	}
	
	
	public static void main(String[] args) {
		
		IMother child= new ChildClass();
		child.joinCollege();
		
		
	}
}
