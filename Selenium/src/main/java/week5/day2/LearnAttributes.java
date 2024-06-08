package week5.day2;

import org.testng.annotations.Test;

public class LearnAttributes {
	/*
	//Concept-1 TestNG executes as per alphabetical order of methodName
	@Test
	public void ctest1() {
		System.out.println("test1 is success");
	}
	@Test
	public void atest2() {
		System.out.println("test2 is success");
	}
	@Test
	public void btest3() {
		System.out.println("test3 is success");
	}
	*/
				/*
//Concept-2 Priority
				@Test(priority=2, invocationCount=3)
				public void cvalue1() {
					System.out.println("value1 is success");
				}
				@Test (enabled=true)
				public void avalue2() {
					System.out.println("value2 is success");
				}
				@Test (priority=1)
				public void bvalue3() {
					System.out.println("value3 is success");
				}
				@Test (priority=3)
				public void bvalue4() {
					System.out.println("value4 is success");
				}
				*/
				/*
//Concept-3 enabled
				@Test(priority=2)
				public void cvalue1() {
					System.out.println("value1 is success");
				}
				@Test (enabled=false)
				public void avalue2() {
					System.out.println("value2 is success");
				}
				@Test (priority=1)
				public void bvalue3() {
					System.out.println("value3 is success");
				}
				@Test (priority=3)
				public void bvalue4() {
					System.out.println("value4 is success");
				}
	 			*/
				/*
//Concept-4 invocationCount and ThreadPoolSize
				@Test(invocationCount=3,threadPoolSize=0)
				public void cvalue1() {
					System.out.println("value1 is success");
				}
				@Test
				public void avalue2() {
					System.out.println("value2 is success");
				}
				@Test
				public void bvalue3() {
					System.out.println("value3 is success");
				}
				@Test
				public void dvalue4() {
					System.out.println("value4 is success");
				}
				*/
//Concept-5 dependsOnMethod		
				
				@Test
				public void cvalue1() {
					System.out.println("value1 is success");
				}
				@Test
				public void avalue2() {
					System.out.println("value2 is success");
				}
				@Test(dependsOnMethods="cvalue1")
				//@Test(dependsOnMethods={"cvalue1", "avalue2" etc}
				public void bvalue3() {
					System.out.println("value3 is success");
				}
				
}
