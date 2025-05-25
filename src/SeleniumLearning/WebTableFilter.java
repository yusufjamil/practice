package SeleniumLearning;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class WebTableFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		"C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//"
		+ "chromedriver.exe");
				        
		WebDriver driver = new ChromeDriver();
						
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		WebElement veggies=driver.findElement(By.id("search-field"));
		veggies.sendKeys("Rice");
		
		List<WebElement> veggiesResults=driver.findElements(By.xpath("//tr/td[1]"));
		
		List <WebElement>veggiesList=veggiesResults.stream().filter(veggie->veggie.getText().contains("Rice"))
		.collect(Collectors.toList());
		
		Assert.assertEquals(veggiesResults.size(), veggiesList.size());
		
		driver.close();
		
	}

}
