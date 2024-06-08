package week4.day2;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class IncognitoAndInprivate {

public static void main(String[] args) {
		
//		EdgeOptions options=new EdgeOptions();
//		ChromeOptions option=new ChromeOptions();
		FirefoxOptions option=new FirefoxOptions();
		
//		options.addArguments("--incognito"); ->chrome
//		options.addArguments("--inprivate"); ->edge
//		option.addArguments("--private"); Not working
		
		FirefoxDriver driver=new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://jqueryui.com/selectable/");
		
		Actions action=new Actions(driver);
	}
}