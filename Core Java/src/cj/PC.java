package cj;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PC {

	
	@BeforeMethod
	public void beforeRun() 
	{
		System.out.println("before run");
	}
	
	public void doThis() 
	{
		System.out.println("do this");
	}
	
	@AfterMethod
	public void afterRun() 
	{
		System.out.println("ater run");
	}

}
