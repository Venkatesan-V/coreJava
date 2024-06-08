package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnDoubleClick {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments(args);
		ChromeDriver driver=new ChromeDriver(option);
		System.out.println(driver);
		driver.get("https://leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement mess = driver.findElement(By.xpath("//label[text()='Message']"));
		Actions op=new Actions(driver);
		op.doubleClick(mess).perform();
		
	}

}
