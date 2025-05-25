package SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		"C://Users//Jalil//eclipse-workspace//Drivers//"
		+ "ChromeDriver//chromedriver-win64//chromedriver.exe");
												        
		WebDriver driver = new ChromeDriver();
												
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
										
		driver.manage().window().maximize();
		
		String month="January";
		
		String monthValue="1";
		
		String day="26";
		
		String year="2025";
		
		String[] expectedDate= {monthValue,day,year};
		
		//Open date
		
		WebElement calendar=driver.findElement(By.className("react-date-picker__inputGroup"));
		
		calendar.click();
		
		//Select Month Year
		WebElement selectMonthYear=driver.findElement(By.xpath("//span[contains(@class,'react-calendar__navigation__label')]"));
		
		//January 2025
		selectMonthYear.click();
		
		//2021-2030
		selectMonthYear.click();
		
		//Select Year(2025)
		WebElement Year=driver.findElement(By.xpath("//button[text()='"+year+"']"));
		
		Year.click();
		
		WebElement selectMonth=driver.findElement(By.xpath("//abbr[text()='"+month+"']"));
		//January
		selectMonth.click();
		
		//List<WebElement> selectMonths=driver.findElements(By.xpath("//button[contains(@class,'react-calendar__year-view__months__month')]"))
		//.get(Integer.parseInt(monthValue)-1).click();
		
		WebElement selectDay=driver.findElement(By.xpath("//abbr[text()='"+day+"']"));
		//26
		selectDay.click();
		
		WebElement completeDate=driver.findElement(By.className("react-date-picker__inputGroup"));
		
		System.out.println(completeDate.getText());
		
		// 0 //-No element found multiple tags are present
		
		List<WebElement> monthDateYear=driver.findElements(By.xpath("//input[contains(@class,'react-date-picker__inputGroup__input react-date-picker__inputGroup')]"));
		
		for(int i=0;i<monthDateYear.size();i++) 
		{
			String dateText=monthDateYear.get(i).getAttribute("value");
			
			System.out.println(dateText);
			
			Assert.assertEquals(dateText, expectedDate[i]);
		}
		
		driver.close();		
				
	}

}
