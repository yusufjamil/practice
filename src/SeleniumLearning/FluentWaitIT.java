package SeleniumLearning;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitIT {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver",
            "C://Users//Jalil//eclipse-workspace//Drivers//ChromeDriver//chromedriver-win64//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.manage().window().maximize();


        WebElement start = driver.findElement(By.cssSelector("[id='start'] button"));
        start.click();

        Wait < WebDriver > wait = new FluentWait < WebDriver > (driver)
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofSeconds(3))
            .ignoring(NoSuchElementException.class);

        WebElement finish = driver.findElement(By.cssSelector("[id='finish'] h4"));

        WebElement fluentWaitExample = wait.until(new Function < WebDriver, WebElement > () {
            public WebElement apply(WebDriver driver) {
                if (finish.isDisplayed()) {
                    return finish;
                } else {
                    return null;
                }

            }


        });
        System.out.println(finish.getText());
        driver.close();

    }

}