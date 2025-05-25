package SeleniumLearning;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandleAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		"C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
				        
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		WebElement multipleWindows=driver.findElement(By.xpath("//a[text()='Multiple Windows']"));
		multipleWindows.click();
		
		WebElement openingWindowText=driver.findElement(By.cssSelector("div[class='example'] h3"));
		wait.until(ExpectedConditions.visibilityOf(openingWindowText));
		
		System.out.println(openingWindowText.getText());
		
		WebElement clickHere=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHere.click();
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
		String parentId=it.next();
		
		String childId=it.next();
		
		driver.switchTo().window(childId);
		
		WebElement newWindow=driver.findElement(By.cssSelector("div[class='example'] h3"));
		
		System.out.println(newWindow.getText());
		
		driver.quit();
		
	}

}
