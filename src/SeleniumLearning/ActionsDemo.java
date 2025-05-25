package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
        "C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(15000);
		
        driver.get("https://www.amazon.in/");
        
        driver.manage().window().maximize();
        
        //WebDriverWait wait=new WebDriverWait(driver,5);
        
        //Actions class designed to perform Mouse and Keyboard interactions in selenium
        Actions actions=new Actions(driver);
        //build-Ready to execute
        //perform-executes
        
        
        WebElement searchAmazon=driver.findElement(By.cssSelector("[placeholder='Search Amazon.in']"));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Search Amazon.in']")));
        //doubleClick-selects text
        actions.moveToElement(searchAmazon).click().keyDown(Keys.SHIFT).sendKeys("hi").doubleClick().build().perform();
        
        WebElement accountAndLists=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
        //contextClick-right click on element
        actions.moveToElement(accountAndLists).contextClick().build().perform();
        
        
	}

}
