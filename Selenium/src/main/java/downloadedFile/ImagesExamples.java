package downloadedFile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagesExamples {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("type application url");
		WebElement imageOne = driver.findElement(By.xpath("first element xpath"));
		imageOne.click();
		
//		How to find whether Images in present or broken?
		
		WebElement brokenImage = driver.findElement(By.xpath("first element xpath"));
//		By using css class, natuarlwidth=0;
		if(brokenImage.getAttribute("natuarlWidth").equals("0")) {
			System.out.println("Image is broken");
		}else {
			System.out.println("Image is not broken");
		}
		
	}
}
