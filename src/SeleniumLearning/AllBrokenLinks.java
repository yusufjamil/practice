package SeleniumLearning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class AllBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		"C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		List<WebElement> allBrokenLinks=driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		
		SoftAssert sa=new SoftAssert();
		
		for(WebElement brokenLink:allBrokenLinks) 
		{
			String url=brokenLink.getAttribute("href");
			
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			
			int responseCode=conn.getResponseCode();
			
			System.out.println(responseCode);
			
//			Assert.assertTrue(responseCode<400,"The broken link text is "+brokenLink.getText()+" with response code "+responseCode);
			
			sa.assertTrue(responseCode<400,"The broken link text is "+brokenLink.getText()+" with response code "+responseCode);			
			
			/*if(responseCode>400) 
			{
			System.out.println("The broken link text is "+brokenLink.getText()+" with response code "+responseCode);
				Assert.assertTrue(false);
			}*/
			
		}
		//Soft assertions store the result of all assertions
		//If all assertions doesn't pass then assertAll will fail the script
		//assertAll reports all failures
		sa.assertAll();
		
		driver.close();
	}

}
