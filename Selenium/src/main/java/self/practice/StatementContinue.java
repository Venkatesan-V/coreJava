package self.practice;

public class StatementContinue {

	public static void main(String[] args) {
		
		for (int i=2;i<=10;i++)
		{
			if(i==3) {
				System.out.println("three");
				continue;
			}
			System.out.println(i);
		}

	}

}
