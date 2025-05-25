package SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		"C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
						        
		WebDriver driver = new ChromeDriver();
						
		driver.get("https://the-internet.herokuapp.com/");
				
		driver.manage().window().maximize();
		
		WebElement nestedFrames=driver.findElement(By.xpath("//a[text()='Nested Frames']"));
		
		nestedFrames.click();
		
		
		List <WebElement> iframesList=driver.findElements(By.tagName("frame"));
		
		System.out.println(iframesList);
		
		Thread.sleep(5000);
		
		WebElement frameTop=driver.findElement(By.className("frame-top"));
		
		WebElement iframeMiddle=driver.findElement(By.className("frame-middle"));
		
		driver.switchTo().frame(frameTop);
		
		driver.switchTo().frame(iframeMiddle);
		
		//driver.switchTo().frame(1);
		
		WebElement middleFrameText=driver.findElement(By.id("content"));
		
		System.out.println(middleFrameText.getText());
		
		driver.switchTo().defaultContent();
		
		driver.close();
	}

}
