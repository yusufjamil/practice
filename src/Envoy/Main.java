package Envoy;
import java.awt.AWTException;
import java.io.File;
import Envoy.Login;
import Envoy.CreateEmployee;
import Envoy.CreateCase;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Main  {

	public static void main(String[] args)throws IOException,InterruptedException, AWTException {
		// TODO Auto-generated method stub
		//setting up chrome driver
		//System. setProperty() in Selenium is used to configure system properties that affect the behavior of the WebDriver
		//It allows testers to set properties like the browser driver executable path before initializing the WebDriver 
		//ensuring proper communication between the test script and the browser.
		System.setProperty("webdriver.chrome.driver","C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
		//creating driver instance
		//Selenium WebDriver is a browser automation framework that allows users to execute cross-browser tests
		//Cross browser testing refers to testing a website in multiple browsers like IE,Chrome,Firefox to check its efficacy on each
		WebDriver driver=new ChromeDriver();
		//maximizing window
		//In Selenium the manage() method returns an instance of the underlying implementation of the Options interface
		//The manage() method is declared in the WebDriver interface The return type of this method is Options 
		//The Options interface has a method called window() that returns an Interface type Window
		//The manage() method can be used to maximize the test browser window 
		//For example manage().window().maximize() is a predefined method of the Selenium 'WebDriver' Class 
		//that maximizes the test browser window
		driver.manage().window().maximize();
		//launching url
		//The get() method in Selenium is the most common way to open a URL
		//It opens the URL in the current browser window or tab
		//The get() method waits until the page is fully loaded before returning control to the test case
		driver.get("https://qa.envoy.global/client/auth/login");
		//printing current url
		//getCurrentUrl() is a method in Selenium WebDriver that retrieves the current URL of the web page opened in the browser
		System.out.println(driver.getCurrentUrl());
		//getting title
		//The getTitle() method in Selenium returns the title of the current page
		System.out.println(driver.getTitle());
		//writing locator
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		Login login=new Login();
		login.loginToEnvoy(driver);
		CreateEmployee createEmployee=new CreateEmployee();
		createEmployee.newEmployee(driver);
		CreateCase createCase=new CreateCase();
		createCase.createCase(driver);
		//closes only the current window on which Selenium is running automated tests
		driver.close();
		//The driver.quit() method in Selenium closes all open browser windows or tabs and terminates the WebDriver session
		driver.quit();
		
		
	}

}
