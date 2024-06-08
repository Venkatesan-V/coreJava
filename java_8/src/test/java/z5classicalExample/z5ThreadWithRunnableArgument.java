package z5classicalExample;

public class z5ThreadWithRunnableArgument {

	public static void main(String[] args) {
		
		Thread thread=new Thread(new Runnable() {
			
			public void run() {
				for(int i=0; i<2;i++)
				System.out.println("Anonymous inner class");
			}
			
		});
		thread.start();
//		Above method is implemented in another way
		/*
		new Thread(new Runnable() {
			
			public void run() {
				for(int i=0; i<2;i++)
				System.out.println("Anonymous inner class");
			}
			
		});.start();
		*/	
		
		
		
	}
}
