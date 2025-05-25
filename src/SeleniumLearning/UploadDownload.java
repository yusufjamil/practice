package SeleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UploadDownload {

	public static void main(String[] args) 
	{
		String fruitName="Apple";
		String originalPrice="345";
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
		
		WebElement downloadButton=driver.findElement(By.id("downloadButton"));
		downloadButton.click();
		
		WebElement uploadButton=driver.findElement(By.cssSelector("[type='file']"));
		uploadButton.sendKeys("C://Users//Jalil//Downloads//download.xlsx");
		
		By toastMessage=By.cssSelector("div.Toastify__toast-body :nth-child(2)");
		//By toastMessage=By.cssSelector(".Toastify__toast-body div:nth-child(2)");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
		
		String toastMessageText=driver.findElement(toastMessage).getText();
		System.out.println(toastMessageText);
		Assert.assertEquals(toastMessageText, "Updated Excel Data Successfully.");
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
		
		
		@SuppressWarnings("deprecation")
		//String priceColumn=driver.findElement(By.xpath("//div[text()='Price']")).
		//getAttribute("data-column-id");
		
		String actualPrice=driver.findElement(By.xpath("//div[text()='"+fruitName+"']"
		+ "/../..//div[4]")).getText();
		
		System.out.println(originalPrice);
		System.out.println(actualPrice);
		
		Assert.assertEquals(originalPrice, actualPrice);
		
		driver.close();

	}

}
