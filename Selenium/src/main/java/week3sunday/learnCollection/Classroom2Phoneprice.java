package week3sunday.learnCollection;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classroom2Phoneprice {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phones",Keys.ENTER);
		List<WebElement> prodList = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));	
			System.out.println(prodList.size());
		List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));	
			/*System.out.println(priceList.size());*/
		List<Integer> newPrice=new ArrayList<Integer>(); //ctrl+shft+O
		for(WebElement price:priceList) {
			String text = price.getText();     //getText allows to print webElements(productname), otherwise alphanumeric value
			/*System.out.println(text);*/ //price printed with comma which cannot be accepted as Integer
	// To remove comma
			String replace = text.replace(",", "");
			/*System.out.println(replace);*/
	//To convert String to Integer
			String zreplace = replace.replaceAll("\\D", "");
			int parseInt = Integer.parseInt(zreplace);
			newPrice.add(parseInt);
			
		}
			System.out.println(newPrice);
	// To get Maximum and Minimum price -- Alternateway is to Sort & use index []
			Integer maxim = Collections.max(newPrice);
			Integer minim = Collections.min(newPrice);
			System.out.println(maxim);
			System.out.println(minim);
	/*if(!replace.isBlank()) {} helps to find any blank webElement*/
			
			Set<Integer> priceSet=new HashSet<Integer>(newPrice);
			System.out.println(priceSet);
			int size = priceSet.size();
			System.out.println(size);
			
			if(priceSet.size()==newPrice.size()) {
				System.out.println("No dup");
			}
			else {
				System.out.println("Dup found");
			}
			
			
			
	}
}
