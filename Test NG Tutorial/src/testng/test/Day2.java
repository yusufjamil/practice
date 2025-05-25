package testng.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@AfterTest
	public void postrequisites() 
	{
		System.out.println("postrequisites");
	}
	
	@Test(groups= {"smoke"})
	public void ploan() 
	{
		System.out.println("ploan class day 2");
	}
	
	@BeforeSuite
	public void beforeSuite() 
	{
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void afterSuite() 
	{
		System.out.println("after suite");
	}

@BeforeTest
public void prerequisites() 
{
	System.out.println("prerequisites");
}

}
