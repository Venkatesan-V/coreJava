package z3aic_Interface;

public class Runner {

	public static void main(String[] args) {
		
		IParent obj=new IParent() {
			
			public void findPartner() {
				System.out.println("My life My Rules from innerClass");
			}
		};
		
		obj.findPartner();
		
		
	}
	
}
