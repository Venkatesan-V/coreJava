package self.practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class rough2 {
	int random;
	
	public int randomnum() {
		int random=(int) (Math.random()*9999999);
		return random;
	}
		@Test
		public void casual() throws IOException {
	
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement print = driver.findElement(By.xpath("//input[@type='text']"));
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("casual shoes");
			
			//File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
			//File destn=new File("./snap/shot.png"); // provide file location and format
			//FileUtils.copyFile(screenshotAs, destn);
				
			File snaps = print.getScreenshotAs(OutputType.FILE);
			File loc = new File ("./snap/"+random+".jpg");
			FileUtils.copyFile(snaps, loc);
			
	}
}

