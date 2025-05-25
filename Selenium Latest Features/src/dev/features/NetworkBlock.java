package dev.features;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v131.network.Network;

import com.google.common.collect.ImmutableList;

public class NetworkBlock 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		DevTools devTools=driver.getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devTools.send(Network.setBlockedURLs(ImmutableList.of("*.jpg","*.css")));
		
		long startTime=System.currentTimeMillis();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		WebElement browseProducts=driver.findElement(By.linkText("Browse Products"));
		browseProducts.click();
		
		WebElement coursesLinkText=driver.findElement(By.linkText("Selenium"));
		coursesLinkText.click();
		
		WebElement addToCart=driver.findElement(By.cssSelector(".add-to-cart"));
		addToCart.click();
		
		WebElement addedToCartHeader=driver.findElement(By.cssSelector("p:nth-child(1)"));
		System.out.println(addedToCartHeader.getText());
		
		long endTime=System.currentTimeMillis();
		
		System.out.println(endTime-startTime);
		
		driver.close();
	}

}
