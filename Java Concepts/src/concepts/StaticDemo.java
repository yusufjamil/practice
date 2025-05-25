package concepts;

public class StaticDemo 
{
	String name;
	String address;
	static String city;
	static int i;
	
	static 
	{
		city="c1";
		i=0;
	}

	StaticDemo(String name,String address)
	{
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i);
	}
	public String getAddress()
	{
		System.out.println(address+" "+city);
		return address;
	}
	
	public static void getCity()
	{
		System.out.println(city);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StaticDemo sd=new StaticDemo("a1","b1");
		StaticDemo sd1=new StaticDemo("a2","b2");
		sd.getAddress();
		sd1.getAddress();
		StaticDemo.getCity();
		StaticDemo.i=3;
	}

}
