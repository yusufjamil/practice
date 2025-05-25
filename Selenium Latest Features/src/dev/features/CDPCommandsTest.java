package dev.features;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;

public class CDPCommandsTest {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		DevTools devTools=driver.getDevTools();
		devTools.createSession();
		
		Map<String,Object> deviceMetrics=new HashMap<String,Object>();
		deviceMetrics.put("width", 600);
		deviceMetrics.put("height", 1000);
		deviceMetrics.put("deviceScaleFactor", 50);
		deviceMetrics.put("mobile", true);
		
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		WebElement hamburgerMenu=driver.findElement(By.className("navbar-toggler-icon"));
		hamburgerMenu.click();
		
		Thread.sleep(3000);
		
		WebElement libraryLinkHeader=driver.findElement(By.linkText("Library"));
		libraryLinkHeader.click();
		
		driver.close();
	}

}
