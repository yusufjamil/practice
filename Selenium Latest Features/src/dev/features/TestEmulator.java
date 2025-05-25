package dev.features;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;

public class TestEmulator 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		//To access Chrome Dev Tools
		ChromeDriver driver=new ChromeDriver();
		DevTools devTools=driver.getDevTools();
		devTools.createSession();
		
		//Send commands to CDP
		devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		WebElement hamburgerMenu=driver.findElement(By.className("navbar-toggler-icon"));
		hamburgerMenu.click();
		
		Thread.sleep(3000);
		
		WebElement libraryLinkHeader=driver.findElement(By.linkText("Library"));
		libraryLinkHeader.click();
		
		driver.close();
		
		
	}

}
