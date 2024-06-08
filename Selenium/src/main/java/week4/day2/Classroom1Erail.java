package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Classroom1Erail {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments(args);
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// From Station
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MS", Keys.ENTER);
	// To Station
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU", Keys.ENTER);	
	// click on sort on date
		driver.findElement(By.id("chkSelectDateOnly")).click();
	// Get the trains
		driver.findElement(By.id("buttonFromTo")).click();
	// To retrieve the Train Names
		List<WebElement> trainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr[2]/td[2]/a"));
		//Using forEach Loop
		for(WebElement trainnam : trainNames) {
			String text =trainnam.getText();
			System.out.println(text);
		}	
		// Using ForLoop
		List<WebElement> trainNamez = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
		
		for(int i=2;i<=trainNamez.size();i++) {
			String tname = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(tname);
		}
	}

}





















