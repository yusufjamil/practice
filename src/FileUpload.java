import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class FileUpload 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub
		String downloadPath=System.getProperty("user.dir");
		HashMap<String,Object> chromePrefs=new HashMap<String,Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		
		ChromeOptions c=new ChromeOptions();
		c.setExperimentalOption("prefs", chromePrefs);
		
		WebDriver river=new ChromeDriver();
		
		river.manage().window().maximize();
		
		river.get("https://jumpshare.com/file-sharing/txt");
		
		WebElement chooseTxtFile=river.findElement(By.cssSelector("label[for='guest-file-upload']"));
		chooseTxtFile.click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C://Users//Jalil//Desktop//File Upload.exe");
		
		WebElement shareYourCode=river.findElement(By.xpath("//a[normalize-space()='Share Your Code']"));
		shareYourCode.click();
		
		WebElement threeDots=river.findElement(By.xpath
		("//button[@class='btn btn-default dropdown-toggle more_dropdown_toggle more_dropdwn']"));
		threeDots.click();
		
		WebElement download=river.findElement(By.xpath("//ul[@id='viewer_more_menu']"
		+ "/li/a[text()='Download']"));
		download.click();
		
		File f=new File(downloadPath+"//Daily Notes.txt");
		if(f.exists())
		{
			Assert.assertTrue(f.exists());
		}
		if(f.delete())
		{
			System.out.println("file not found");
		}
		
		//river.close();
	}

}
