package concepts;

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CentralTraffic a=new AustralianTraffic();
		ContinentalTraffic ct=new AustralianTraffic();
		a.greenGo();
		a.redStop();
		a.flashYellow();
	}

	@Override
	public void greenGo() 
	{
		// TODO Auto-generated method stub
		System.out.println("Green go");
	}

	@Override
	public void redStop() 
	{
		// TODO Auto-generated method stub
		System.out.println("Red stop");
	}
	
	public void flashYellow() 
	{
		// TODO Auto-generated method stub
		System.out.println("Flash yellow");
	}

	@Override
	public void continentalTraffic() 
	{
		// TODO Auto-generated method stub
		System.out.println("Continental traffic");
	}

	

}
