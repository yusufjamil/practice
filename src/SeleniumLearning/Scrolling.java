package SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		"C://Users//Jalil//eclipse-workspace//Drivers//"
		+ "ChromeDriver//chromedriver-win64//chromedriver.exe");
														        
		WebDriver driver = new ChromeDriver();
														
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
												
		driver.manage().window().maximize();
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		
		//To scroll in console using Javascript
		
		//window.scrollBy(0,100)
		je.executeScript("window.scrollBy(0,100)");
		
		Thread.sleep(3000);
		
		//document.querySelector(".tableFixHead").scrollTop=5000
		//scrollTop=scrolls down rows go up
		
		je.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		//div[@class="tableFixHead"]//td[4]-4th column in table
		
		//.tableFixHead td:nth-child(4)
		
		List<WebElement>amountColumn=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum=0;
		for(int i=0;i<amountColumn.size();i++) 
		{
			Integer amountColumnValues=Integer.parseInt(amountColumn.get(i).getText());
			sum=sum+amountColumnValues;
			//System.out.println(amountColumnValues);
		}
			System.out.println(sum);
			
			WebElement totalAmount=driver.findElement(By.className("totalAmount"));
			
			String totalAmountText=totalAmount.getText().split(":")[1].trim();
			
			int TotalAmountNumber=Integer.parseInt(totalAmountText);
			
			Assert.assertEquals(sum,TotalAmountNumber);
			
			
			
		
		
			driver.close();
	}

}
