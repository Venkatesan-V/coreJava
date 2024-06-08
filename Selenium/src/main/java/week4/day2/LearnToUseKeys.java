package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnToUseKeys {

	public static void main(String[] args) throws IOException {
		//Learn to hold multiple keys using ctrl
		ChromeOptions option=new ChromeOptions();
		option.addArguments(args);
		
		ChromeDriver driver=new ChromeDriver(option);
		System.out.println(driver);
		
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions act=new Actions(driver);
		driver.switchTo().frame(0);
		
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		/* Method-1
		act.keyDown(Keys.CONTROL)
		.click(item1)
		.click(item2)
		.click(item4)
		.click(item5)
		.keyUp(Keys.CONTROL)
		.perform();
		*/
		
		// Method-2
		act.keyDown(Keys.CONTROL)
		.click(item1).click(item2).click(item4).click(item5)
		.keyUp(Keys.CONTROL)
		.perform();
		
	// To take SNAPSHOT
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File destn=new File("./snap/shot.png"); // provide file location and format
		FileUtils.copyFile(screenshotAs, destn); //add throws exception
		
	// After execution-->refresh lefthandside-->snap folder-->shot.png-->rightclick-->Openwith-->SystemEditor
	//Screenshot taken below the Menu bar and not from url.
		
	// To take Snapshot of particular Element 
		File screenshotAs1 = item4.getScreenshotAs(OutputType.FILE); //--> enter particular webElement
		File destn1=new File("./snap/shot1.png"); // provide file location and format
		FileUtils.copyFile(screenshotAs1, destn1); //add throws exception
		
	
	}

}
