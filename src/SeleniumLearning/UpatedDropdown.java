package SeleniumLearning;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement passengers=driver.findElement(By.id("divpaxinfo"));
		passengers.click();
		Scanner scanner=new Scanner(System.in);
		int n;
		System.out.println("Enter number of times the passenger dropdown to be selected");
		n=scanner.nextInt();
		Thread.sleep(5000);
		WebElement passengerOptions=driver.findElement(By.id("hrefIncAdt"));
		for(int i=0;i<n;i++) {
			passengerOptions.click();
		}
		System.out.println(passengers.getText());
		WebElement done=driver.findElement(By.id("btnclosepaxoption"));
		done.click();
	}

}
