package testng.test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener 
{

	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Listeners executed successfully");
	}
	
	public void onTestFailure(ITestResult result) 
	{
		//result.getName()-Gets the method that failed
		System.out.println("Listeners failed successfully "+result.getName());
	}


}
