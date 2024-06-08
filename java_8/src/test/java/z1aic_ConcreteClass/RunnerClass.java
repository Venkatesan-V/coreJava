package z1aic_ConcreteClass;



public class RunnerClass {

	public static void main(String[] args) {
		
	
	ParentClass child=new ParentClass() 
	{
//		Child class has only one implementation, so do not want to waste the memory, i can call directly.
		public void findPartner() {
			System.out.println("My life My Rules");
		}
	
	};
	child.educate();
	child.assets();
	child.findPartner();
	
	ParentClass parent=new ParentClass();
	parent.findPartner();
	
	}	
}
