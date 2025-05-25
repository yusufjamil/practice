package SeleniumLearning;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HTTPSCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeOptions-ChromeOptions class checks the behaviour of browser
		ChromeOptions chromeOptions=new ChromeOptions();
		
		//setAcceptInsecureCerts-true-Bypasses the certificates and navigates to site
		
		chromeOptions.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver",
		"C://Users//Jalil//eclipse-workspace//Drivers//"
		+ "ChromeDriver//chromedriver-win64//chromedriver.exe");
																				        
		WebDriver driver = new ChromeDriver(chromeOptions);
																				
		driver.get("https://expired.badssl.com/");
																		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		Proxy proxy=new Proxy();
		
		proxy.setHttpProxy("ipaddress:4444");
		
		chromeOptions.setCapability("proxy", proxy);
		
		driver.close();
	}

}
