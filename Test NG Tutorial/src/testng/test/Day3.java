package testng.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test(groups= {"smoke"})
	public void webLoginCarLoan() 
	{
		System.out.println("web login car loan class day 3");
	}
	
	@Test(timeOut=4000)
	public void mobileLoginCarLoan() 
	{
		System.out.println("mobile login car loan");
	}
	
	@Test
	public void mobileLoginSignIn(String urlname) 
	{
		System.out.println("mobile login sign in");
		System.out.println(urlname);
	}
	
	@Test
	@Parameters({"URL","APIKey/usrname"})
	public void carLoan(String urlname,String apiKey) 
	{
		System.out.println("car loan");
		System.out.println(urlname);
		System.out.println(apiKey);
	}
	
	@Test(dataProvider="getData")
	public void mobileLoginSignOut(String username,String password) 
	{
		System.out.println("mobile login sign out");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getData() 
	{
		//1st combintion-Usernme,Password and good credit history
		//2nd-Username,Password and no credit history
		//3rd-fraudulent credit history
		
		//3-Total combinations of TestCases
		//2-No of fields-Username,Password
		
		Object[][] data=new Object[3][2];
		
		/* 
		 0  	0 1
		 1   	0 1
		 2    	0 1
		 */
		
		//1st set
		data[0][0]="firstsetusername";
		data[0][1]="firstsetpassword";
		
		data[1][0]="secondsetusername";
		data[1][1]="secondsetpassword";
		
		data[2][0]="thirdsetusername";
		data[2][1]="thirdsetpassword";
		
		return data;
	}
}
