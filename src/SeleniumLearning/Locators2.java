package SeleniumLearning;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Locators2 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String Name="rahul";
		System.setProperty("webdriver.chrome.driver", "C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password=getPassword(driver);
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(Name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello " +Name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
		
	}
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String passwordText=driver.findElement(By.cssSelector("form p")).getText();
		//Splits string as per our requirement based on the criteria provided
		String[] passwordArray=passwordText.split("'");
		String password=passwordArray[1].split("'")[0];
		return password;
		//passwordArray
		//Please use temporary password-0th index
		//rahulshettyacademy' to Login.-1st index
	}

}
