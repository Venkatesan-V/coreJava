package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Classroom2AlertandFrame {

	public static void main(String[] args) {
		
		ChromeOptions option= new ChromeOptions();
		option.addArguments(args);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		  WebDriver frame = driver.switchTo().frame(0);
		 
		  List<WebElement> noOfFrames = driver.findElements(By.tagName("iframe"));
		  System.out.println(noOfFrames.size()); driver.switchTo().defaultContent();
		  
		  driver.switchTo().frame("iframeResult");
		  driver.findElement(By.xpath("//button[text()='Try it']")).click();
		  driver.switchTo().alert().accept();
		  
		  String text = driver.findElement(By.id("demo")).getText();
		  System.out.println(text);
		
	}

}
