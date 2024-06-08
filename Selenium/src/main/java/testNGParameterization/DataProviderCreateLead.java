package testNGParameterization;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

		public class DataProviderCreateLead extends BaseClass {
				String[][] data;
	
		
		@BeforeClass
			public void setfileName() {
				filename="dataprovexcel";
				sheetno=0;
			}
				
		@Test(dataProvider="fetchData", threadPoolSize=2)
		public void runCreate(String cname, String fname, String lname, String phno) {
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
			driver.findElement(By.name("submitButton")).click();
		}
		
		/*
		@DataProvider(name="fetchData")
		public String [][] sendData () throws IOException {
		return LearnExcelData.readData("dataprovexcel"); //pass excelsheet name in arguments
		}
	*/
}

