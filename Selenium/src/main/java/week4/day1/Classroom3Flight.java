package week4.day1;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Classroom3Flight {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification");  // select List<String>arguments
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
	// windowHandles provides--> address of all window open and uses Set interface and Non duplicate
				Set<String> irctcWin = driver.getWindowHandles();
				System.out.println(irctcWin.size());
		
	// To get the focus of the child window/tab
	// Step2: convert Set to List
			List<String> irctcwHandle=new ArrayList<String>(irctcWin);
		
	//Step3: switch to child window using List.get(index)
			driver.switchTo().window(irctcwHandle.get(1));
			System.out.println(driver.getTitle());
			driver.close();
			
	}
}
