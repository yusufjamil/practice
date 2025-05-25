package SeleniumLearning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		//Broken links-Links(URLs) not working
		//Navigate to Network clink on XHR check API calls status codes
		//status code=200's-link not broken
		//status code=400's not working
		
		//Sets a system property for the Java Virtual Machine (JVM) during runtime.
		//The key "webdriver.chrome.driver" tells Selenium WebDriver where to find the ChromeDriver 
		//executable.
		//The second argument is the full path to the chromedriver.exe file on your system.
		System.setProperty("webdriver.chrome.driver",
		"C://Users//Jalil//eclipse-workspace//Drivers//"
		+ "ChromeDriver//chromedriver-win64//chromedriver.exe");
																								        
		//WebDriver is an interface provided by Selenium that defines methods for browser automation, 
		//like navigating to a URL, interacting with elements, etc.
		WebDriver driver = new ChromeDriver();
		
		//driver.manage():
		//Provides access to manage various browser settings like timeouts, cookies, and window size.
		//window():Returns a WebDriver.Window object to manage the browser window
		//maximize():Maximizes the browser window to fill the screen, 
		//similar to clicking the maximize button on a regular browser window.
		driver.manage().window().maximize();
		
		//deleteAllCookies():Clears all cookies for all domains loaded during the session.
		driver.manage().deleteAllCookies();
		
		//is used in Selenium WebDriver to navigate the browser to the specified URL. 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//driver.findElement:Finds the first web element on the page matching the specified selector. 
		//If no element is found, it throws a NoSuchElementException.
		WebElement checkBrokenLink=driver.findElement(By.cssSelector("a[href*='soapui']"));
		
		//Get URL
		//The getAttribute() method in Selenium WebDriver is used to retrieve the value of a 
		//specific attribute of an element. 
		String url=checkBrokenLink.getAttribute("href");
		
		//HttpURLConnection is used to establish an HTTP connection to a given URL
		//openConnection():This method is called on the URL object to open a connection to the 
		//resource referenced by the URL.
		HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
		
		//The HEAD method is similar to the GET method but only requests the headers from the server, 
		//not the body of the response. 
		
		conn.setRequestMethod("HEAD");
		
		//connect():It opens the connection to the URL specified in the HttpURLConnection object
		
		conn.connect();
		
		//The getResponseCode() method of HttpURLConnection retrieves the HTTP status code 
		//returned by the server. This status code is a 3-digit number that represents the 
		//outcome of the HTTP request.
		
		int responseCode=conn.getResponseCode();
		
		//System.out: This refers to the standard output stream (usually the console or terminal).
		//println(): This method prints a line of text followed by a line break 
		//(i.e., it moves the cursor to the next line).
		
		System.out.println(responseCode);
		
		driver.close();
		
	}

}
