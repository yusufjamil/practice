package SeleniumLearning;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSortingJavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		"C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//"
		+ "chromedriver.exe");
		        
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		WebElement sortIcon=driver.findElement(By.xpath("//span[text()='Veg/fruit name']//"
				+ "following::span[1]"));
		sortIcon.click();
		
		List<WebElement> vegFruits=driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> vegFruitList=vegFruits.stream().map(a->a.getText()).collect(Collectors.toList());
		
		List<String>vegFruitItemsListSorted=vegFruitList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(vegFruitList.equals(vegFruitItemsListSorted));
		
		List<String> price;
		do
		{
			List<WebElement> groceries=driver.findElements(By.xpath("//tr/td[1]"));
			price=groceries.stream().filter(a->a.getText().contains("Rice"))
			.map(a->getPriceVeggie(a)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		if(price.size()<1) 
		{
			WebElement next=driver.findElement(By.cssSelector("[aria-label='Next']"));
			next.click();
		}
		}while(price.size()<1);
		
		driver.close();
		
	}

	private static String getPriceVeggie(WebElement a) {
		// TODO Auto-generated method stub
		String priceValue=a.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return priceValue;
	}

}
