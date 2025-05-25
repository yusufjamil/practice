package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement checkbox1=driver.findElement(By.id("checkBoxOption1"));
		checkbox1.click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		checkbox1.click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.close();
	}

}
