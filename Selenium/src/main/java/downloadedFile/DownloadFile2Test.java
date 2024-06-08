package downloadedFile;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile2Test {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml");
		driver.findElement(By.id("j_idt93:j_idt95")).click();

		Thread.sleep(3000);

		File FileLoc = new File("C:\\Users\\LENOVO\\Downloads");
		File[] totalFiles = FileLoc.listFiles();
		for (File file : totalFiles) {
			if (file.getName().equalsIgnoreCase("TestLeaf Logo.png")) {
				System.out.println("File is downloaded");
				break;
			} else {
				System.out.println("Download failed");
				break;
			}

		}
		driver.close();
	}
}

