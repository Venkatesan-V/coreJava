package downloadedFile;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadedFileTest {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/p/page7.html");
		driver.findElement(By.linkText("ZIP file")).click();
		
		Thread.sleep(3000);
		
		File FileLoc = new File("C:\\Users\\LENOVO\\Downloads");
		File[] totalFiles = FileLoc.listFiles();
		for (File file : totalFiles) {
			if (file.getName().equalsIgnoreCase("DownloadDemo-master.zip")) {
			System.out.println("File is downloaded");
		}
	}
}
}
