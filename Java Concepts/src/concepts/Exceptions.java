package concepts;

public class Exceptions 
{
static int a=1;
static int b=0;


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		finally
		{
			System.out.println("finally");
		}
	}

}
