package Envoy;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	public void loginToEnvoy(WebDriver driver) throws IOException, InterruptedException {
		
		WebElement email=driver.findElement(By.xpath("//input[@data-placeholder='Enter your email']"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-placeholder='Enter your email']")));
		
		email.sendKeys("company.admin1@automation.com");
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		WebElement password=driver.findElement(By.xpath("//input[@data-placeholder='Enter your password']"));
		
		password.sendKeys("Password@123");
		
		FileUtils.copyFile(screenshot,new File("C://Users//Jalil//Pictures//Envoy Screenshots//loginpage.png"));
		
		WebElement login=driver.findElement(By.xpath("//span[normalize-space()='Log In']"));
		
		login.click();
		
		FileUtils.copyFile(screenshot,new File("C://Users//Jalil//Pictures//Envoy Screenshots//login_button.png"));
		
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
	}

}
