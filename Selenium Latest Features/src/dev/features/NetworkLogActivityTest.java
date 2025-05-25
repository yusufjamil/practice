package dev.features;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v131.network.Network;
import org.openqa.selenium.devtools.v132.network.model.Request;
import org.openqa.selenium.devtools.v132.network.model.Response;

public class NetworkLogActivityTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		DevTools devTools=driver.getDevTools();
		devTools.createSession();
		//log file
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		
		devTools.addListener(Network.requestWillBeSent(), request->
		{
			org.openqa.selenium.devtools.v131.network.model.Request req=request.getRequest();
			//System.out.println(req.getUrl());
		});
		
		//Event will fire
		devTools.addListener(Network.responseReceived(), response->
		{
			org.openqa.selenium.devtools.v131.network.model.Response res=response.getResponse();
			//System.out.println(res.getUrl());
			//System.out.println(res.getStatus());
			if(res.getStatus().toString().startsWith("4")) 
			{
				System.out.println(res.getUrl()+" is failing ith status code "+res.getStatus());
			}
			
		});
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		WebElement virtualLibrary=driver.findElement(By.cssSelector("button[routerlink*='/library']"));
		virtualLibrary.click();
		
		driver.close();

	}

}
