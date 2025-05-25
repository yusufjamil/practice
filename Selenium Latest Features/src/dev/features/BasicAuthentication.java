package dev.features;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.URI;
import java.util.function.Predicate;

public class BasicAuthentication 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		Predicate <URI> uriPredicate = uri->uri.getHost().contains("httpbin.org");
		
		((HasAuthentication)driver).register(uriPredicate,UsernameAndPassword.of("foo", "bar"));
		
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		driver.get("http://httpbin.org/basic-auth/foo/bar");
		
		driver.close();
		
	}

}
