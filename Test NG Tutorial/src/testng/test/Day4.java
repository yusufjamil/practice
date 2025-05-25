package testng.test;

import org.testng.annotations.Test;

public class Day4 
{
	
	@Test(groups= {"smoke"})
	public void webLoginCarLoan() 
	{
		System.out.println("web login car loan class day 4");
	}
	
	@Test(enabled=false)
	public void mobileLoginCarLoan() 
	{
		System.out.println("mobile login car loan");
	}
	
	@Test(dependsOnMethods= {"webLoginCarLoan","mobileLoginCarLoan"})
	public void loginAPICarLoan() 
	{
		System.out.println("login API car loan");
	}
}
