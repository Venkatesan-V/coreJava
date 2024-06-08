package downloadedFile;

import java.awt.Toolkit;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrieveYoutubePlaylist {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.youtube.com/playlist?list=PLLS0D9-W-1dkcN9ZFFWTcIAawh6kZwahS");
		Toolkit.getDefaultToolkit().getSystemClipboard();
		
		List<WebElement> head = driver.findElements(By.xpath("//h3[@class='style-scope ytd-playlist-video-renderer']"));
		int headCount = head.size();
		System.out.println(headCount);
		
		for (WebElement title : head) {
			String alltitlehead = title.getText();
			System.out.println(alltitlehead);
		}
		
		
		
		
		
		
		
		
	}
}

