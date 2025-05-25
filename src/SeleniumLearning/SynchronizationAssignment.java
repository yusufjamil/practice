package SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationAssignment {
public static void kartItems(WebDriver driver) throws InterruptedException {
WebDriverWait webDriverWait=new WebDriverWait(driver,java.time.Duration.ofSeconds(5));
WebElement userName=driver.findElement(By.id("username"));
userName.sendKeys("rahulshettyacademy");
WebElement passWord=driver.findElement(By.id("password"));
passWord.sendKeys("learning");
WebElement user=driver.findElement(By.xpath("//span[contains(text(),'User')]/..//span[@class='checkmark']"));
user.click();
webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='okayBtn']")));
WebElement okay=driver.findElement(By.id("okayBtn"));
okay.click();
WebElement consultant=driver.findElement(By.cssSelector("select.form-control"));
Select select=new Select(consultant);
select.selectByValue("consult");
WebElement termsAndConditions=driver.findElement(By.id("terms"));
termsAndConditions.click();
WebElement signIn=driver.findElement(By.id("signInBtn"));
signIn.click();
webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Shop Name']")));
List<WebElement> phones=driver.findElements(By.xpath("//h4[@class='card-title']/a"));
System.out.println(phones.size());
List<WebElement> addButtons=driver.findElements(By.xpath("//button[contains(text(),'Add')]"));
for(int i=0;i<phones.size();i++) {
	addButtons.get(i).click();
}
int index = 0;
for (WebElement phone : phones) {
    addButtons.get(index).click();
    index++;
}

}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		"C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,java.time.Duration.ofSeconds(5));
		kartItems(driver);
		WebElement checkout=driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']"));
		checkout.click();
		WebElement addCheckout=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		addCheckout.click();
		WebElement chooseDeliveryLocation=driver.findElement(By.id("country"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("country")));
		chooseDeliveryLocation.sendKeys("Ind");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='suggestions']/ul/li/a")));
		List<WebElement> chooseDeliveryLocationOptions=driver.findElements(By.xpath("//div[@class='suggestions']/ul/li/a"));
		for(WebElement deliveryLocationOptions:chooseDeliveryLocationOptions) {
			if(deliveryLocationOptions.getText().equalsIgnoreCase("India")) {
				deliveryLocationOptions.click();
			}
		}
		WebElement termsAndConditions=driver.findElement(By.id("checkbox2"));
		// Wait for the termsAndConditions checkbox to be clickable
		wait.until(ExpectedConditions.elementToBeClickable(By.id("checkbox2")));
		termsAndConditions.click();
		WebElement purchase=driver.findElement(By.cssSelector("[value='Purchase']"));
		purchase.click();
		WebElement successMessage=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		System.out.println(successMessage.getText());
		driver.close();
		
	}
	

}
