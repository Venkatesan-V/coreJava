package week3.saturday.LearnInheritance;

public class Classroom4Calculator {

	public void add(int x, int y, int z) 
	{
		System.out.println(x+y+z);
	}
	public void add(int a, int b) 
	{
		System.out.println(a+b);
	}
	public void add(float c, float d) 
	{
		System.out.println(c+d);
		}
	public void add(float c, int x) 
	{
		System.out.println(c+x);
	}
	public void add() {
		System.out.println("task to add");
	}
	
	public static void main(String[] args) {
		Classroom4Calculator sum=new Classroom4Calculator();
		sum.add(10, 20, 30);
		sum.add(20, 30);
		sum.add(1.201f, 2.301f);
		sum.add(1.52f, 10);
		sum.add();
	}
}
