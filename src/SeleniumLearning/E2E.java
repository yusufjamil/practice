package SeleniumLearning;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement fromDepartureCity=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		fromDepartureCity.click();
		WebElement fromDepartureCityOption=driver.findElement(By.xpath("//a[@value='AIP']"));
		fromDepartureCityOption.click();
		WebElement toArrivalCity=driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		toArrivalCity.click();
		WebElement ToArrivalCityOption=driver.findElement(By.xpath("//a[@value='AMD']"));
		ToArrivalCityOption.click();
		WebElement departDate=driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']"));
		departDate.click();
		WebElement passengers=driver.findElement(By.id("divpaxinfo"));
		passengers.click();
		Thread.sleep(5000);
		WebElement passengerOptions=driver.findElement(By.id("hrefIncAdt"));
		for(int i=0;i<2;i++) {
			passengerOptions.click();
		}
		WebElement done=driver.findElement(By.id("btnclosepaxoption"));
		done.click();
		WebElement currency=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(currency);
		Thread.sleep(2000);
		//getFirstSelectedOption()-Gets first selected option if multiple options are present or gets the first if single one is present
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		WebElement escort=driver.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']"));
		escort.click();
		WebElement search=driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
		search.click();
		driver.close();
		
	}

}
