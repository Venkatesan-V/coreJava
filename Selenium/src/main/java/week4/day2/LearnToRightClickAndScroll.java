package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnToRightClickAndScroll {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments(args);
		ChromeDriver driver=new ChromeDriver(option);
		System.out.println(driver);
		driver.get("https://leafground.com/menu.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement customer = driver.findElement(By.xpath("//span[text()='Customers']"));
		Actions act= new Actions(driver);
	//To right click WebElement
		act.contextClick(customer).perform();
		
	//To scroll mouse down
		act.scrollByAmount(0, 120).perform();
		
	//To scroll mouse up
		act.scrollByAmount(0, -120).perform();
	}

}
