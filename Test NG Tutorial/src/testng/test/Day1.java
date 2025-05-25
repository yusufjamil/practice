package testng.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {

	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("before class");
	}
	
	
	@Test(groups= {"smoke"})
	public void demo() 
	{
		System.out.println("test class day 1");
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("before method");
	}
	
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("after method");
	}
	
	@Parameters({"URL"})
	@Test
	public void demo1(String urlname) 
	{
		System.out.println("test1");
		System.out.println(urlname);
	}
	
	@Test
	public void demo2() 
	{
		System.out.println("test2");
		Assert.assertTrue(false);
	}
}
