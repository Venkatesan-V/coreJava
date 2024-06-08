package self.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LocateDropDown {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Opportunities")).click();
		driver.findElement(By.linkText("Opportunities")).click();
		driver.findElement(By.linkText("Create Opportunity")).click();
		WebElement parentEle = driver.findElement(By.id("createOpportunityForm_typeEnumId"));
		
		Select dd=new Select(parentEle);
		dd.selectByIndex(3);
		dd.selectByVisibleText("Upgrade");
		dd.selectByValue("SOTYP_UPGRD");
		
		//driver.close();
		
	}

}
