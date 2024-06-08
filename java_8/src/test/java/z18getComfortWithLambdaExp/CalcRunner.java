package z18getComfortWithLambdaExp;

public class CalcRunner {

	public void classicalWay() {
		Calculate calcu=new CalcImp();
		System.out.println("Classical Way output " +calcu.add(10, 20));
	}
	
	public void anonymousClass() {
		Calculate calcul= new Calculate() {
			public int add(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1+num2;
			}
		};
		System.out.println("Anonymous way output " +calcul.add(20, 40));
	}
	
	public void usinglambdas() {
		Calculate CalcImp = (int num1, int num2) -> {return num1+num2;};
		Calculate CalcImp1 = (num1, num2) -> num1+num2;
		
		System.out.println("Using lambda Method 1 " +CalcImp.add(5, 7));
		System.out.println("Using lambda Method 2 " +CalcImp1.add(12, 15));
		
	}
	
	public static void main(String[] args) {
	
		CalcRunner run= new CalcRunner();
		run.classicalWay();
		run.anonymousClass();
		run.usinglambdas();
		
		
		
	}
}
