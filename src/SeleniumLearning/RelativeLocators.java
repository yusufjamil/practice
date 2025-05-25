package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
///import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		"C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//"
		+ "chromedriver.exe");
						        
		WebDriver driver = new ChromeDriver();
								
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.manage().window().maximize();
		
		WebElement Name=driver.findElement(By.name("name"));
		
		//WebElement aboveElement = driver.findElement(with(By.tagName("label")).above(Name));
		
		
		//System.out.println(aboveElement.getText());
		
		WebElement dateOfBirthLabel=driver.findElement(By.cssSelector("[for='dateofBirth']"));
		
		//WebElement belowElement = driver.findElement(with(By.tagName("input")).below(dateOfBirthLabel));
		//belowElement.click();
		
		//WebElement belowElement = driver.findElement(with(By.tagName("input")).leftOf(dateOfBirthLabel));
		
		//WebElement belowElement = driver.findElement(with(By.tagName("input")).rightOf(dateOfBirthLabel));
		
		System.out.println(org.openqa.selenium.remote.RemoteWebDriver.class.getPackage().getImplementationVersion());
	}

}
