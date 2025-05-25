package concepts;

public class ChildClass extends ParentClass 
{
	String colour="green";
	
	public void engine()
	{
		System.out.println("engine");
	}
	
	public void colour()
	{
		System.out.println(colour);
	}
	
	public void brakes()
	{
		System.out.println("new brakes");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChildClass cd=new ChildClass();
		cd.colour();
		cd.brakes();
	}

}
