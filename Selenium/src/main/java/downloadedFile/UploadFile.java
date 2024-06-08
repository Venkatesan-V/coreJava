package downloadedFile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//		TRY THIS IN LEAFTAPS WEB PAGE
		
		driver.get(" paste url ");
		driver.findElement(By.id(""));
		WebElement uploadButton = driver.findElement(By.id("filename"));
		uploadButton.click();
		Thread.sleep(2000);
		
		String file="C:\\Users\\LENOVO\\Downloads";
		StringSelection selection = new StringSelection("file");
//		StringSelection converts String into plain text
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
//		Any mouse, keyboard actions we use Actions class but this is applicable to web applications
//		To interact with windows local directory, we use Robot class
		Robot robot=new Robot(); //awt -> Abstract Window Toolkit
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
}
}