package testNGParameterization;

import java.io.IOException;

import java.time.Duration;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DeleteLead extends BaseClass{
		String[][] data;
		
		@BeforeClass
		public void setfileName() {
			filename="dataprovexcel";
			sheetno=1;
		}
		
	@Test(dataProvider="fetchData", threadPoolSize=2)
	public void deleteTc002(String phno) throws InterruptedException {
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equalsIgnoreCase ("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		//driver.close();
	}
		/*
		@DataProvider(name="fetchData")
		public String [][] sendData () throws IOException {
			return LearnExcelData.readData("deleteLead"); //pass excelsheet name in arguments
		}
		*/
	}

