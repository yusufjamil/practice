package concepts;

public class ChildDemo extends ParentDemo
{
	String name="a2";
	
	
	public ChildDemo()
	{
		super();
		System.out.println("child demo");
	}
	
	public void getData()
	{
		System.out.println(name);
		System.out.println(super.name);
		super.data();
	}
	
	public void data()
	{
		System.out.println("child data");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChildDemo cd=new ChildDemo();
		cd.getData();
	}

}
