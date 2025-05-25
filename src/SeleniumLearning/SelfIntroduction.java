package SeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Invoking Browser
		//WebDriver driver =new ChromeDriver();
		//WebDriver Interface:driver object here has access to all methods of ChromeDriver class which are defined in WebDriver Interface
		//Selenium Manager sets chrome set property-Chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
		//Invoke Chrome Driver
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver(); 
		//Launching url
		driver.get("https://rahulshettyacademy.com");
		//getTitle()-Gets title of current launched url
		System.out.println(driver.getTitle());
		//getCurrentUrl()-Gets current url
		System.out.println(driver.getCurrentUrl());
		//Closes current window
		driver.close();
		//closes all associated windows
		driver.quit();
		

	}

}
