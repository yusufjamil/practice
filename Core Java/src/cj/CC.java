package cj;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CC extends PC 
{

	@Test
	public void testRun() 
	{
		int a=3;
		
		doThis();
		
		CC1 cc1=new CC1(a);
		
		System.out.println(cc1.increment());
		
		CC2 cc2=new CC2(a);
		
		System.out.println(cc2.multiply());
		
	}
	
	

}
