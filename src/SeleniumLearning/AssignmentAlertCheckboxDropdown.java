package SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AssignmentAlertCheckboxDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		"C://Users//Jalil//eclipse-workspace//Drivers//"
		+ "ChromeDriver//chromedriver-win64//chromedriver.exe");
										        
		WebDriver driver = new ChromeDriver();
										
		driver.get("https://qaclickacademy.com/practice.php");
								
		driver.manage().window().maximize();
		
		WebElement checkboxLabel=driver.findElement(By.xpath("//label[@for='bmw']"));
		
		String checkboxLabelText=checkboxLabel.getText();
				
		WebElement checkboxOption=driver.findElement(By.xpath("//div[@id='checkbox-example']//label"
				+ "[@for='bmw']/input"));
		
		checkboxOption.click();
		
		System.out.println(checkboxLabelText);
		
		WebElement dropdownExample=driver.findElement(By.id("dropdown-class-example"));
		
		List<WebElement> dropdownExampleOption=driver.findElements(By.xpath("//select"
				+ "[@id='dropdown-class-example']//option[contains(text(),'Option')]"));
		
		for(WebElement dropdownOption:dropdownExampleOption) 
		{
			if(dropdownOption.getText().equalsIgnoreCase(checkboxLabelText)) 
			{
				dropdownOption.click();
				
				Thread.sleep(3000);
				
				break;
			}
		}
		
		WebElement enterOption = driver.findElement(By.id("name"));
		
		enterOption.sendKeys(checkboxLabelText);
		
		Thread.sleep(2000);
		
		WebElement Alert = driver.findElement(By.id("alertbtn"));
		
		Alert.click();
		
		Thread.sleep(5000);
		
		String alertText=driver.switchTo().alert().getText();
		
		System.out.println(alertText);
		
		Assert.assertTrue(alertText.contains(checkboxLabelText),checkboxLabelText);
		
		driver.switchTo().alert().accept();
		
		driver.switchTo().defaultContent();
		
		driver.close();
				
	}

}
