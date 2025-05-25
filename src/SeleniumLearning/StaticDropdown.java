package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement currency=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//Static dropdown handling select tag
		//selectByIndex
		//selectByVisibleText
		//selectByValue
		Select dropdown=new Select(currency);
		dropdown.selectByIndex(1);
		Thread.sleep(2000);
		//getFirstSelectedOption()-Gets first selected option if multiple options are present or gets the first if single one is present
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		Thread.sleep(2000);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("USD");
		Thread.sleep(2000);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.close();
	}

}
