package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandle {

	public static void main(String[] args) {
			
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification");  // select List<String>arguments
		ChromeDriver driver=new ChromeDriver(options);
	//printing the unique address
		System.out.println(driver);
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	// To get the address of the current opened window using windowHandle method
		String windowHandle = driver.getWindowHandle();
	// printing the leafground unique address
		System.out.println(windowHandle);
		
	// windowHandle provides--> current window address
	
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		System.out.println(driver.getTitle()); //returns Homepage title as windows
	
	// windowHandles provides--> address of all window open and uses Set interface and Non duplicate
			Set<String> windowHandles = driver.getWindowHandles();
			System.out.println(windowHandles.size());
	
	// To get the focus of the child window/tab
	// Step2: convert Set to List
		List<String> wHandle=new ArrayList<String>(windowHandles);
	
	//Step3: switch to child window using List.get(index)
		driver.switchTo().window(wHandle.get(1));
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(wHandle.get(0));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> winHandles = driver.getWindowHandles();
		/*System.out.println(winHandles.size());*/
	//Another Method using for each to know address of each window
		for (String string: winHandles) {
			System.out.println(string);
		}
		/*
		List<String> winHandles1=new ArrayList<String>(winHandles);
		driver.switchTo().window(winHandles1.get(1));
		System.out.println(driver.getTitle());
		*/
		
		//driver.close(); Closes active/current window
		//driver.quit(); Closes all the Windows
		
		
	}

}
