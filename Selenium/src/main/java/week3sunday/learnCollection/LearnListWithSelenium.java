package week3sunday.learnCollection;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnListWithSelenium {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//input[@name='keyword']")).sendKeys("SportsShoe", Keys.ENTER);
		// Other Way
		//driver.findElement(By.xpath("//input[@name='keyword']")).sendKeys("SportsShoe");
		//driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		// returntype of findElement is WebElement (also an Interface)
		List<WebElement> prodList = driver.findElements(By.xpath("//p[@class='product-title']"));	
		System.out.println(prodList.size());
		//System.out.println(prodList); is not possible, need to .getText();
	// To print all 20 products--Using for-each loop
		
		for(WebElement sshoe:prodList) {
			String text = sshoe.getText();     //getText allows to print webElements(productname), otherwise alphanumeric value
			System.out.println(text);
		}
	
	}
}
