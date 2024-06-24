package downloadedFile;

import java.awt.Toolkit;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dummy {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.youtube.com/playlist?list=PLLS0D9-W-1dnFbSyuXD-u_76fKwbGOEHt");
		Toolkit.getDefaultToolkit().getSystemClipboard();

		Actions act= new Actions(driver);
		act.scrollByAmount(0, 2000).perform();
		Thread.sleep(5000);

		List<WebElement> head = driver.findElements(By.xpath("//h3[@class='style-scope ytd-playlist-video-renderer']"));
		int headCount = head.size();
		System.out.println(headCount);

		//	act.scrollByAmount(0, 200).perform();

		for (WebElement title : head) {

			String alltitlehead = title.getText();

			System.out.println(alltitlehead);
		}	

		/*
	List<WebElement> head1 = driver.findElements(By.xpath("//h3[@class='style-scope ytd-grid-playlist-renderer']"));	
		for (WebElement title1 : head1) {
			String alltitlehead1 = title1.getText();
			System.out.println(alltitlehead1);

	}
		 */



	}
}
