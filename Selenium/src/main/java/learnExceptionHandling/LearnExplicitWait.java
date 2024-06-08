package learnExceptionHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/waits.xhtml");
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		
		String text = driver.findElement(By.xpath("//span[text()='I am here']")).getText();
		System.out.println(text);
		/*
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		String text2 = driver.findElement(By.xpath("//span[text()='Click Second']")).getText();
		System.out.println(text2);
		*/
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
		String text3 = driver.findElement(By.xpath("//span[text()='I am about to hide']")).getText();
		System.out.println(text3);
		
	}

}
