package excelIntegration;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testNGParameterization.BaseClass;
import testNGParameterization.LearnExcelData;

public class CreateLead extends BaseClass {
	String[][] data;
	
	public String dataprovexcel;
	@Test(dataProvider="fetchData", threadPoolSize=2)
		public void runCreate(String cname, String fname, String lname, String phno) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("CreateLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("CreateLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("CreateLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("CreateLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();
		
		}
	@DataProvider(name="fetchData")
	public String [][] sendData () throws IOException {
		return LearnExcelData.readData(dataprovexcel, sheetno);
	}	
}
