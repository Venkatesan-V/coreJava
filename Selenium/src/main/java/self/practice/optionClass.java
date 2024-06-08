package self.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class optionClass {
	
	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
//		
		options.addArguments("start-maximized",
				"--incognito",
				"--disable-infobars",
				"--headless",
				"--disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("https://www.myntra.com/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		/*
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		*/
		
	}	
	}