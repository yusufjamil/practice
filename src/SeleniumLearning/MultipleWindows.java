package SeleniumLearning;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		"C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//"
		+ "chromedriver.exe");
								        
		WebDriver driver = new ChromeDriver();
										
		driver.get("https://rahulshettyacademy.com/angularpractice/");
				
		driver.manage().window().maximize();
		
		//driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
		
		driver.switchTo().newWindow(org.openqa.selenium.WindowType.WINDOW);
		
		Set<String> windowHandles=driver.getWindowHandles();
		
		Iterator<String>it=windowHandles.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		
		driver.switchTo().window(childWindow);
		
		driver.get("https://rahulshettyacademy.com/");
		
		List<WebElement> courseLinks=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']"));
		
		String courseName=courseLinks.get(5).getText();
		
		System.out.println(courseName);
		
		driver.switchTo().window(parentWindow);
		
		WebElement name=driver.findElement(By.name("name"));
		name.sendKeys(courseName);
		
		File src=name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("name.png"));
		
		int height=name.getRect().getDimension().getHeight();
		
		int width=name.getRect().getDimension().getWidth();
		
		System.out.println(height);
		
		System.out.println(width);
		
		driver.quit();
		
	}

}
