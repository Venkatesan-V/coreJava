package z13defaultMethodsExample;

public class Edge implements Browser {

	public void browse() {
		System.out.println("ms edge browser");
	}
	public static void main(String[] args) {

		Browser edge=new Edge();
		
		edge.browse();
//		edge.mediaPlayer(); Edge can use or cannot use default method.
		
		
		
		
		
		
		
	}
}
