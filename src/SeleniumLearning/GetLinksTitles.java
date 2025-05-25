package SeleniumLearning;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetLinksTitles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		"C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
								        
		WebDriver driver = new ChromeDriver();
								
		driver.get("https://qaclickacademy.com/practice.php");
						
		driver.manage().window().maximize();
		
		List<WebElement> linksCount=driver.findElements(By.tagName("a"));
		
		System.out.println("The total links count is "+linksCount.size());
		
		//Limiting driver scope
		
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
		
		List<WebElement> footerLinks=footerDriver.findElements(By.tagName("a"));
		
		System.out.println("The footer links count is "+footerLinks.size());
		
		WebElement column1Driver=driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
		
		List<WebElement>column1DriverLinks=column1Driver.findElements(By.tagName("a"));
		
		System.out.println("The Column 1 links count is "+column1DriverLinks.size());
		
		//Actions actions=new Actions(driver);
		
		for(int i=0;i<column1DriverLinks.size();i++) 
		{
			
			WebElement clickFooterLinks=column1DriverLinks.get(i);
			
			String clickLinkToOpen=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			//actions.moveToElement(clickFooterLinks).sendKeys(clickLinkToOpen);
			
			clickFooterLinks.sendKeys(clickLinkToOpen);
		}
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
		//hasNext-Tells whether next window is present or not
		
		while(it.hasNext()) 
		{
			driver.switchTo().window(it.next());
			
			String printTitle=driver.getTitle();
			
			System.out.println(printTitle);
		}
		
		driver.quit();
		
	}

}
