package Envoy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://qa.envoy.global/client/auth/login");
//To use select class select and option tags should be present
Select select=new Select(driver.findElement(By.id("select")));
select.selectByValue("2");
select.selectByIndex(6);
select.selectByVisibleText("1 Adult");
	}

}
