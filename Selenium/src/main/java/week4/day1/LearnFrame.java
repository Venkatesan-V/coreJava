package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
	//To handle the Frame
		WebDriver frame = driver.switchTo().frame(0);
		
		WebElement firstframeElement = driver.findElement(By.id("Click"));
		firstframeElement.click();
		System.out.println(firstframeElement.getText());
		driver.switchTo().defaultContent();
				
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Count Frames");
		*/
		List<WebElement> noOfFrames = driver.findElements(By.tagName("iframe"));
		System.out.println(noOfFrames.size());
		/*
		WebElement Outerframe = driver.findElement(By.xpath("(//div[@class='card']//iframe)[3]"));
		
	// Switching to the OuterFrame in the Nested frame using frame as WebElement
		driver.switchTo().frame(Outerframe);
		
	// Switching to the inner frame to click the WebElement using Attribute
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		
	// Switching to immediate parent frame
		driver.switchTo().parentFrame();
		*/
	}

}
