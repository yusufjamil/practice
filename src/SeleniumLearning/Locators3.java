package SeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		//Navigates to specified url from first specified url
		driver.navigate().to("https://rahulshettyacademy.com");
		//Navigates back to first specified url
		driver.navigate().back();
		//Navigates to next url
		driver.navigate().forward();
	

}
}
