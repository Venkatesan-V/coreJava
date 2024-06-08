package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnToHover {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("-disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(option);
		System.out.println(driver);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement mens = driver.findElement(By.xpath("//a[text()='Men']"));
	//Instantiate the Actions class to AUI
		Actions build=new Actions(driver); //import
	// Mouse hover the WebElement
		build.moveToElement(mens).perform();
		
		WebElement tshirt = driver.findElement(By.xpath("//a[text()='T-Shirts']"));
		build.moveToElement(mens).click(tshirt).perform();
		
		
	}

}
