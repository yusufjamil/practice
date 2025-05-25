package SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		"C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
				        
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		List <WebElement> iframesList=driver.findElements(By.tagName("iframe"));
		
		System.out.println(iframesList.size());
		
		WebElement iframe=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(iframe);
		
		//driver.switchTo().frame(0);
		
		
		Actions actions=new Actions(driver);
		
		WebElement dragMeToTarget=driver.findElement(By.id("draggable"));
		
		WebElement dropMeHere=driver.findElement(By.id("droppable"));
		
		actions.dragAndDrop(dragMeToTarget, dropMeHere).build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.close();
		
	}

}
