package SeleniumLearning;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKart {
public static void addItems(WebDriver driver,String[] items) {
	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
	int j=0;
	for(int i=0;i<products.size();i++)
	{
		String[] name=products.get(i).getText().split("-");
		String formattedName=name[0].trim();
		name[0]="Broccoli";
		name[1]="1 Kg";
		List itemsList= Arrays.asList(items);
		if(itemsList.contains(formattedName)) {
			j++;
			List<WebElement> addToCart=driver.findElements(By.xpath("//div[@class='product-action']/button"));
			addToCart.get(i).click();
			if(j==items.length)
			break;
		}
			
	}
}
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		GreenKart greenKart=new GreenKart();
		String[] items= {"Cucumber","Brocolli","Cauliflower","Beetroot","Carrot"};
		System.setProperty("webdriver.chrome.driver",
		"C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait webDriverWait=new WebDriverWait(driver,Duration.ofSeconds(5));
		addItems(driver, items);
		WebElement cartBag=driver.findElement(By.xpath("//img[@alt='Cart']"));
		cartBag.click();
		WebElement proceedToCheckout=driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']"));
		proceedToCheckout.click();
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		WebElement enterPromoCode=driver.findElement(By.cssSelector("input.promoCode"));
		enterPromoCode.sendKeys("rahulshettyacademy");
		WebElement apply=driver.findElement(By.cssSelector("button.promoBtn"));
		apply.click();
		//Explicit Wait
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		WebElement promoCodeText=driver.findElement(By.cssSelector("span.promoInfo"));
		System.out.println(promoCodeText.getText());
		driver.close();
		
		

}

}