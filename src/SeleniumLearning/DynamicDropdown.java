package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement roundTrip=driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		roundTrip.click();
		WebElement fromDepartureCity=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		fromDepartureCity.click();
		WebElement fromDepartureCityOption=driver.findElement(By.xpath("//a[@value='AIP']"));
		fromDepartureCityOption.click();
		WebElement toArrivalCity=driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		toArrivalCity.click();
		WebElement ToArrivalCityOption=driver.findElement(By.xpath("//a[@value='AMD']"));
		ToArrivalCityOption.click();
		//Select calendar
		WebElement departDate=driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']"));
		departDate.click();
		driver.close();
	}

}
