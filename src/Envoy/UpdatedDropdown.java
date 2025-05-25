package Envoy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa.envoy.global/client/auth/login");
		driver.findElement(By.id("divpainfo")).click();
		Thread.sleep(2000L);
//		driver.findElement(By.id("href")).click();
//		driver.findElement(By.id("href")).click();
//		driver.findElement(By.id("href")).click();
//		driver.findElement(By.id("href")).click();
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("href")).click();
			i++;
		}
		driver.findElement(By.id("btn")).click();
		System.out.println(driver.findElement(By.id("divpainfo")).getText());
		//parent child relationship
		// //div[@id="divpax"] //a[v@alue="BLR"]
		
	}

}
