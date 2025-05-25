package SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		"C://Users//Jalil//eclipse-workspace//Drivers//"
		+ "ChromeDriver//chromedriver-win64//chromedriver.exe");
																        
		WebDriver driver = new ChromeDriver();
																
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
														
		driver.manage().window().maximize();
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		
		je.executeScript("window.scrollBy(0,500)");
		
		List<WebElement> rowsCount=driver.findElements(By.xpath("//table[@name='courses']//tr"));
		
		WebElement row2Data=driver.findElement(By.xpath("//table[@name='courses']//tr[3]"));
		
		List<WebElement> columnsCount=driver.findElements(By.xpath("//table[@name='courses']//tr[1]/th"));
		
		System.out.println(rowsCount.size());

		System.out.println(row2Data.getText());
		
		System.out.println(columnsCount.size());
		
		driver.close();
		
	}

}
