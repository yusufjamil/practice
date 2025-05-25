package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Ctrl+Shift+F-Formatting code
		//Debugging-Right click and click on Toggle Breakpoint
		//click on Debug as Java Application
		//Confirm Perspective Switch-Click on Yes
		//click on Step Over
		//Click on Resume -Executes in normal mode
		//Step Into-Control goes inside the step
		String text = "abc";
		System.setProperty("webdriver.chrome.driver",
		"C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement enterYourName = driver.findElement(By.id("name"));
		enterYourName.sendKeys(text);
		Thread.sleep(2000);
		WebElement Alert = driver.findElement(By.id("alertbtn"));
		Alert.click();
		// switchTo-Switch from browser to alert
		// alert().accept()-Accept alert
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		WebElement confirm = driver.findElement(By.id("confirmbtn"));
		confirm.click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		driver.close();

	}

}
