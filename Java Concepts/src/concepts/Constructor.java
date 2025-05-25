package concepts;

public class Constructor 
{

	public Constructor()
	{
		System.out.println("constructor");
	}
	
	public Constructor(int a, int b)
	{
		System.out.println("Parameterized constructor");
	}
	
	public Constructor(String a)
	{
		System.out.println("a1");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Constructor cd=new Constructor();
		Constructor cd1=new Constructor(1,2);
		Constructor cd2=new Constructor("a");
	}

}
