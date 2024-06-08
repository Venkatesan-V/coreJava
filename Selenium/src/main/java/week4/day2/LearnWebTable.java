package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebTable {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable notification");
		
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//To print the data present in the first column header 
		String text = driver.findElement(By.xpath("//table[@role='grid']/thead/tr/th/span")).getText();
		System.out.println(text); 
	//To print the data present in the Third column header 
		String text1 = driver.findElement(By.xpath("//table[@role='grid']/thead/tr/th[3]/span")).getText(); 
		System.out.println(text1);
	// retrieve particular data from specific row and column
		String text2 = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[3]/td[2]/span[3]")).getText();
		System.out.println(text2);
		
	// Find column count in first row
		List<WebElement> columndata = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr[1]/td"));
		int columnsize = columndata.size();
		System.out.println("size of column respective to first row" +columnsize);
	//To print all data from column header
		for(int i=1; i<=columnsize;i++) {
			String cData = driver.findElement(By.xpath("//table[@role='grid']//tr/th["+i+"]/span")).getText();
			System.out.println(cData);
		}
		
	// To get row count of the table
		List<WebElement> rowData = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr"));
		int rsize = rowData.size();
		System.out.println("number of rows in the table" + rsize);
		
	// To get all the Data from 1st column
		for(int i=1;i<=rsize;i++) {
			String firstcolumndata = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr["+i+"]/td[1]")).getText();
			//System.out.println(firstcolumndata);
		// i is not acceptable index in xpath--> need to concatenate
			}
		for(int i=1;i<=rsize;i++) {
			String seccolumndata = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr["+i+"]/td[2]")).getText();
			//System.out.println(seccolumndata);
			}
	// To find duplicates in second column, convert to List/Set or directly to Set
		
		List<String> columnlist= new ArrayList<String>();
		for(int i=1;i<=rsize;i++) {
			String seccolumndata = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr["+i+"]/td[2]")).getText();
			//System.out.println(seccolumndata);
			columnlist.add(seccolumndata);
		}
		Set<String> uniqueColData=new HashSet<String>(columnlist);
		if(columnlist.size()==uniqueColData.size()) {
			System.out.println("No Dup");
		}
		else {
			System.out.println("Found Dup");
		}
	//To retrieve the data from all column of particular row
		for(int i=1;i<=columnsize;i++) {
			String allcoldata = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[1]/td["+i+"]")).getText();
			//System.out.println(allcoldata);
		}
	//To retrieve all the Rows and Column data
		for(int i=1;i<=rsize;i++) {
			for(int j=1;j<=columnsize;j++) {
				String allrowandcol = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(allrowandcol);
			}
		}
			
	}

}
