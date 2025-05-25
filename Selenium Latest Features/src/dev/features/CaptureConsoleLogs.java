package dev.features;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class CaptureConsoleLogs 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String quantityValue="2";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		WebElement browseProducts=driver.findElement(By.linkText("Browse Products"));
		browseProducts.click();
		
		WebElement product=driver.findElement(By.linkText("Selenium"));
		product.click();
		
		WebElement addToCart=driver.findElement(By.cssSelector("button.add-to-cart"));
		addToCart.click();
		
		WebElement cartHeader=driver.findElement(By.linkText("Cart"));
		cartHeader.click();
		
		WebElement quantity=driver.findElement(By.id("exampleInputEmail1"));
		quantity.clear();
		quantity.sendKeys(quantityValue);
		
		LogEntries entry=driver.manage().logs().get(LogType.BROWSER);
		
		List<LogEntry> logs=entry.getAll();
		
		for(LogEntry log:logs)
		{
			System.out.println(log.getMessage());
		}
		
		driver.close();
		
		
	}

}
