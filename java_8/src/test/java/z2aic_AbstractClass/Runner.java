package z2aic_AbstractClass;

import z1aic_ConcreteClass.ParentClass;

public class Runner {

	public static void main(String[] args) {
		
		ParentClass child=new ParentClass() 
		{
//			Child class has only one implementation, so do not want to waste the memory, i can call directly.
			public void findPartner() {
				System.out.println("My life My Rules from innerClass");
			}
		
		};
		
		child.findPartner();
		
		
		
	}
}
