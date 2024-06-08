package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnToDrag {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments(args);
		ChromeDriver driver=new ChromeDriver(option);
		System.out.println(driver);
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	// to drag
		WebElement drag = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
		Actions opt=new Actions(driver);
		opt.dragAndDropBy(drag, 200, 300).perform();
	// to drag to target
		WebElement dragtarget = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement droptarget = driver.findElement(By.xpath("//span[text()='Droppable Target']"));
		opt.dragAndDrop(dragtarget, droptarget).perform();
		
	
	
	}
}
