package SeleniumLearning;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		WebElement country=driver.findElement(By.id("autosuggest"));
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter values from the list of options:1.ind ");
		
		String countrySelectSearch=scanner.next();
		Thread.sleep(3000);
		country.sendKeys(countrySelectSearch);
		System.out.println("Enter values from the list of options:1.India ");
		
		String countrySelectOptionValue=scanner.next();
		Thread.sleep(15000);
		List<WebElement> countryOptions=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement countryOption:countryOptions){
			if(countryOption.getText().equalsIgnoreCase(countrySelectOptionValue)) {
				countryOption.click();
				break;
			}
		}
		Thread.sleep(3000);
		Assert.assertFalse(driver.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).isSelected());
		//isSelected()-Is Web Element selected-returns true or false
		System.out.println(driver.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).isSelected());
		WebElement escort=driver.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']"));
		escort.click();
		System.out.println(driver.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).isSelected());
		//size()-Returns number of Web Elements of a particular type
		System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());
		driver.close();
		
		
	}

}
