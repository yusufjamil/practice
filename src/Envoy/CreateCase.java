package Envoy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CreateCase {
public void createCase(WebDriver driver) {
	WebElement create=driver.findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-mdc-menu-trigger c')]/..//span[normalize-space()='Create']"));
	Actions actions=new Actions(driver);
	actions.moveToElement(create).build().perform();
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", create);
	WebElement newCase=driver.findElement(By.xpath("//span[text()='New Case']"));
	actions.moveToElement(newCase).build().perform();
	executor.executeScript("arguments[0].click();", newCase);
}

}
