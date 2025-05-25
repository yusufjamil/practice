package dev.features;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class GeoLocationTest {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		DevTools devTools=driver.getDevTools();
		devTools.createSession();
		
		Map <String,Object> coordinates=new HashMap<String,Object>();
		//40 3-Madrid
		//17 78-Hyderabad
		coordinates.put("latitude",17);
		coordinates.put("longitude", 78);
		coordinates.put("accuracy", 1);
		
		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
		WebElement googleEditBox=driver.findElement(By.name("q"));
		googleEditBox.sendKeys("netflix",Keys.ENTER);
		
		Thread.sleep(10000);
		
		List<WebElement> netflixLinksHeader=driver.findElements(By.cssSelector("a h3"));
		netflixLinksHeader.get(0).click();
		
		WebElement homePageHeader=driver.findElement(By.cssSelector("div h1"));
		
		String homePageHeaderText=homePageHeader.getText();
		
		System.out.println(homePageHeaderText);
		
		driver.close();
		
	}

}
