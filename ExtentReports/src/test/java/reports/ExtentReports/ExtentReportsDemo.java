package reports.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ExtentReportsDemo 
{
	WebDriver driver;
	ExtentReports extent;
@BeforeTest
public void config() 
{
	String path=System.getProperty("user.dir")+ "//reports//index.html";
	ExtentSparkReporter reporter=new ExtentSparkReporter(path);
	reporter.config().setReportName("Web Automation Results");
	reporter.config().setDocumentTitle("Test Results");
	
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Yousuf");
	
}
	@Test
	public void initialDemo() 
	{
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver",
		"C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");
		//driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		driver.manage().window().maximize();
		String urlTitle=driver.getTitle();
		System.out.println(urlTitle);
		ExtentTest test=extent.createTest("InitialDemo");
		test.fail("Results do not match");
		
	}
	@AfterTest
	public void tearDown() 
    {
        driver.quit();
        extent.flush(); // Flushing extent report at the end
    }
}
