package Envoy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateEmployee {
	
	public void newEmployee(WebDriver driver) throws IOException, InterruptedException, AWTException {
		//If an element is not located then the “ElementNotVisibleException” appears
		
		//Element Not Visible Exception-when a particular web element with which WebDriver has to interact is delayed in its loading
		
		//To prevent this Exception Selenium Wait Commands must be used
		
		//In automation testing Selenium Webdriver wait commands direct test execution to pause for a certain length of time 
		
		//before moving onto the next step 
		
		//This enables WebDriver to check if one or more web elements are present/visible/enriched/clickable etc
		
		//Selenium WebDriver provides three commands to implement waits in tests
		
		//1.Implicit Wait
		
		//2.Explicit Wait
		
		//3.Fluent Wait
		
		//1.Implicit Wait directs the Selenium WebDriver to wait for a certain measure of time before throwing an exception
		
		//Once this time is set WebDriver will wait for the element before the exception occurs
		
		//To add implicit waits in test scripts import the following package
		
		//import java.util.concurrent.TimeUnit;
		
		//Implicit Wait Syntax
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//By using the Explicit Wait command the WebDriver is directed to wait until a certain condition occurs before proceeding with executing the code
		
		//Explicit wait is more intelligent but can only be applied for specified elements 
		
		//However it is an improvement on implicit wait since it allows the program to pause for dynamically loaded Ajax elements
		
		//To use Explicit Wait in test scripts, import the following packages into the script
		
		//import org.openqa.selenium.support.ui.ExpectedConditions
		
		//import org.openqa.selenium.support.ui.WebDriverWait
		
		//Fluent Wait in Selenium marks the maximum amount of time for Selenium WebDriver to 
		
		//wait for a certain condition (web element) becomes visible 
		
		//It also defines how frequently WebDriver will check if the condition appears before throwing the “ElementNotVisibleException”.
		
		//Fluent Wait commands are most useful when interacting with web elements that can take longer durations to load 
		
		//This is something that often occurs in Ajax applications
		
		//Fluent Wait commands are most useful when interacting with web elements that can take longer durations to load. This is something that often occurs in Ajax applications.
		
		//While using Fluent Wait it is possible to set a default polling period as needed 
		
		//The user can configure the wait to ignore any exceptions during the polling period
		
		//Fluent waits are also sometimes called smart waits because they don’t wait out the entire duration defined in the code 
		
		//Instead the test continues to execute as soon as the element is detected 
		
		//– as soon as the condition specified in .until(YourCondition) method becomes true.
		
		//“WebDriverWait” is a class in Java provided by the Selenium framework that allows you to implement 
		
		//the concept of Explicit Waits in your test automation scripts
		
		//What is Expectedconditions in Selenium WebDriver?
		
		//Selenium WebDriver allows for waiting for specific conditions until a defined task is complete
		
		//A WebDriver is a browser automation framework It accepts commands and sends them to a browser
		
		//An automation framework is a testing framework that can be used to manage sophisticated testing on shorter development cycles
		
		//A testing framework is a set of guidelines,tools and methods that help testers build test cases and perform software testing
		
		//Declare and initialise a fluent wait
		
		FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
		.withTimeout(Duration.ofMillis(5000))
		.pollingEvery(Duration.ofMillis(250))
		.ignoring(NoSuchElementException.class);
		
		/*Specify the timeout of the wait
		.withTimeout(Duration.ofMillis(5000));
		Specify polling time
		Selenium's polling time or polling interval is the time interval between when Selenium starts searching again after a failed attempt
		fluentWait.pollingEvery(250, TimeUnit.MILLISECONDS);
		Specify what exceptions to ignore
		fluentWait.ignoring(NoSuchElementException.class);
		 */
		
		//Implicit Wait
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait waitforCreate = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//visibilityOfElementLocated(By locator)
		
		//This condition instructs a command to wait until the element becomes visible
		
		waitforCreate.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class,'mat-focus-indicator mat-mdc-menu-trigger c')]/..//span[normalize-space()='Create']")));
		
		//A WebElement in Selenium is essentially an HTML element on a website
		
		//findElement-This command is used to access any single element on the web page 
		
		//It will return the object of the first matching element of the specified locator
		
		WebElement create=driver.findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-mdc-menu-trigger c')]/..//span[normalize-space()='Create']"));
		
		Actions actions=new Actions(driver);
		
		actions.moveToElement(create).build().perform();
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		executor.executeScript("arguments[0].click();", create);
		
		//create.click();
		
		WebElement newEmployee=driver.findElement(By.xpath("//div[contains(@class,'mat-mdc-menu-c')] //span[text()='New Employee']"));
		
		//newEmployee.click();
		
		executor.executeScript("arguments[0].click();", newEmployee);
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot,new File("C://Users//Jalil//Pictures//Envoy Screenshots//newemployee.png"));
		
		WebElement firstName=driver.findElement(By.xpath("//input[@data-placeholder='First name *']"));
		
		firstName.sendKeys("yus");
		
		WebElement lastName=driver.findElement(By.xpath("//input[@data-placeholder='Last name *']"));
		
		WebDriverWait waitForLastName=new WebDriverWait(driver,Duration.ofSeconds(2));
		
		lastName.sendKeys("ufj");
		
		WebElement division=driver.findElement(By.xpath("//mat-select[@placeholder='Division *']"));
		
		division.click();
		
		int count=0;
		
		String divisionOptionSelect="Division 1";
		
		List <WebElement> divisionOptions=driver.findElements(By.xpath("//mat-select[@placeholder='Division *']//following::mat-option[contains(@class,'mat-option mat-focus-indicator ng-tns-c')]/span"));
		
		for(WebElement options:divisionOptions) 
		{
			String currentDivisionOption=options.getText();
			
			WebDriverWait waitForDivisionOption=new WebDriverWait(driver,Duration.ofSeconds(5));
			
			waitForDivisionOption.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.xpath("//mat-select[@placeholder='Division *']//following::mat-option[contains(@class,'mat-option mat-focus-indicator ng-tns-c')]/span"))));
			
			//waitForDivisionOption.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.xpath("//mat-select[@placeholder='Division *']//following::mat-option[contains(@class,'mat-option mat-focus-indicator ng-tns-c')]/span"))));
			
			if(currentDivisionOption.contains(divisionOptionSelect)) 
			{
				options.click();
				
				count++;
				
				break;
			}
		}
		
		if(count!=0)
		{
			System.out.println(divisionOptionSelect +" has been selected");
		}
		else 
		{
			System.out.println(divisionOptionSelect +" is not present in the dropdown");
		}
		
		
		WebElement emailAddress=driver.findElement(By.xpath("//input[@data-placeholder='Email address *']"));
		
		emailAddress.sendKeys("yus1@en.in");
		
		WebElement jobTitle=driver.findElement(By.xpath("//input[@data-placeholder='Job title']"));
		
		jobTitle.sendKeys("QA");
		
		String jobTitleToSelect="QA";
		
		List <WebElement> jobTitleOptions=driver.findElements(By.xpath("//input[@data-placeholder='Job title']//following::mat-option/span"));
		
		WebDriverWait waitForJobOption = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		for(WebElement jobOptions:jobTitleOptions) 
		{
			if(jobOptions.equals(jobTitleToSelect)) 
			{
				jobOptions.click();
				
				break;
			}
		}
		
		WebElement companyEmployeeId=driver.findElement(By.xpath("//input[@data-placeholder='Company employee ID']"));
		
		companyEmployeeId.sendKeys("123456");
		
		//Date component
		
		WebElement employmentStartDate=driver.findElement(By.xpath("//input[@formcontrolname='startDate']"));
		
		actions.moveToElement(employmentStartDate).build().perform();
		
		employmentStartDate.sendKeys("1242023");
		
		//Select select=new Select(employmentStartDate);
		
		//select.selectByVisibleText("12/26/2023");
		
		//employmentStartDate.sendKeys(Keys.ENTER);
		
		//employmentStartDate.sendKeys(Keys.TAB);
		
		//Java Robot class
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.keyPress(KeyEvent.VK_TAB);
		
		robot.keyRelease(KeyEvent.VK_TAB);
		
		//Java Actions class 
		
//		actions.sendKeys(Keys.TAB).build().perform();
		
//		actions.sendKeys(Keys.RETURN).build().perform();
		
		Thread.sleep(5000);
		
		WebElement department=driver.findElement(By.xpath("//input[@data-placeholder='Department']"));
		
		department.sendKeys("Testing");
		
		WebElement referenceNumber=driver.findElement(By.xpath("//input[@data-placeholder='Reference number']"));
		
		referenceNumber.sendKeys("3125");
		
		WebElement defaultBillingAccount=driver.findElement(By.xpath("//mat-select[@placeholder='Default billing account']"));
		
		defaultBillingAccount.click();
		
		List<WebElement>defaultBillingAccountOptions=driver.findElements(By.xpath("//mat-select[@placeholder='Default billing account']//following::mat-option[contains(@class,'mat-option mat-focus-indicator n')]/span"));
		
		String defaultBillingAccountOption="Division 2";
		
		for(WebElement BillingAccountOptions:defaultBillingAccountOptions) 
		{
			String currentDefaultBillingAccountOption=BillingAccountOptions.getText();
			
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//mat-select[@placeholder='Default billing account']//following::mat-option[contains(@class,'mat-option mat-focus-indicator n')]/span")));
			
			if(currentDefaultBillingAccountOption.contains(defaultBillingAccountOption)) 
			{
				BillingAccountOptions.click();
				
				count++;
				
				break;
			}
		}
		WebElement costCenterNumber=driver.findElement(By.xpath("//input[@data-placeholder='Cost center number']"));
		
		costCenterNumber.sendKeys("3123");
		
		Thread.sleep(2000);
		
		WebElement next=driver.findElement(By.xpath("//span[normalize-space()='Next']"));
		
		next.click();
		
		WebElement save=driver.findElement(By.xpath("//span[normalize-space()='Save']"));
		
		save.click();
		
		FileUtils.copyFile(screenshot,new File("C://Users//Jalil//Pictures//Envoy Screenshots//createemployee3.png"));
		
		
		
		
	}

}
