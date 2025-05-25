package SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdownAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		"C://Users//Jalil//eclipse-workspace//Drivers//"
		+ "ChromeDriver//chromedriver-win64//chromedriver.exe");
																		        
		WebDriver driver = new ChromeDriver();
																		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(40000);
																
		driver.manage().window().maximize();
		
		WebElement typeToSelectCountries=driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']"));
		
		typeToSelectCountries.sendKeys("Ind");
		
		//typeToSelectCountries.sendKeys(Keys.DOWN);
		
		//typeToSelectCountries.sendKeys(Keys.DOWN);
		
		//System.out.println(typeToSelectCountries.getAttribute("value"));
		
		List<WebElement> countryOptions=driver.findElements(By.xpath("//input[@placeholder='Type to Select Countries']//following::li[@class='ui-menu-item']/div"));
		
		for(WebElement country:countryOptions) 
		{
			country.sendKeys(Keys.DOWN);
			
			if(country.getText().equalsIgnoreCase("India")) 
			{
				break;
			}
			
		}
		
		System.out.println(typeToSelectCountries.getAttribute("value"));
		
		driver.close();
	}

}
