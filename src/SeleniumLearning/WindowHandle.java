package SeleniumLearning;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		"C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
		        
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		//WebDriverWait wait=new WebDriverWait(driver,5);
		
		WebElement freeAccessText=driver.findElement(By.partialLinkText("Free Access to"));
		freeAccessText.click();
		
		//Parentid,Childid
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
		//gets the window of 0th index
		String parentId=it.next();
		////gets the window of next index
		String childId=it.next();
		
		driver.switchTo().window(childId);
		
		WebElement emailText=driver.findElement(By.cssSelector("p.im-para.red"));
		//WebElement emailText=driver.findElement(By.cssSelector(".im-para.red"));
		
		String printEmailText=emailText.getText();
		//System.out.println(printEmailText);
		
		String email=printEmailText.replace("Please email us at", "")
		.replace("with below template to receive response", "")
		.trim();
		//System.out.println(email);
		
		driver.switchTo().window(parentId);
		
		WebElement userName=driver.findElement(By.id("username"));
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		
		Thread.sleep(5000);
		
		userName.sendKeys(email);
		
		driver.quit();
		
	}

}
