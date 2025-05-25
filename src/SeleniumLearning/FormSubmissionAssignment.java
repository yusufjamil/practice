package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormSubmissionAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement name=driver.findElement(By.xpath("//label[text()='Name']/..//input"));
		name.sendKeys("abc");
		WebElement email=driver.findElement(By.cssSelector("[name='email']"));
		email.sendKeys("abc@pr.in");
		WebElement password=driver.findElement(By.id("exampleInputPassword1"));
		password.sendKeys("Password@123");
		WebElement loveIcecreams=driver.findElement(By.cssSelector("input#exampleCheck1"));
		loveIcecreams.click();
		WebElement gender=driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown=new Select(gender);
		dropdown.selectByVisibleText("Male");
		WebElement employmentStatus=driver.findElement(By.xpath("//label[text()='Student']/..//input"));
		employmentStatus.click();
		WebElement dateOfBirth=driver.findElement(By.cssSelector("[name='bday']"));
		dateOfBirth.sendKeys("11-01-2025");
		WebElement submit=driver.findElement(By.cssSelector("[value='Submit']"));
		submit.click();
		WebElement submittedText=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		System.out.println(submittedText.getText());
		driver.close();
		
		
		
	}

}
