import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest 
{
	@Test
	public void homePageCheck() throws MalformedURLException 
	{
		DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
		desiredCapabilities.setBrowserName("chrome");
		
		WebDriver driver=new RemoteWebDriver(new URL(" http://192.168.137.1:4444"),desiredCapabilities);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("abc");
		System.out.println(driver.getTitle());
		driver.close();
	}
}
