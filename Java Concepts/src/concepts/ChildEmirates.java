package concepts;

public class ChildEmirates extends ParentAirCraft 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChildEmirates ce=new ChildEmirates();
		ce.bodyColour();
		ce.engine();
		ce.safetyGuidelines();
	}

	@Override
	public void bodyColour() 
	{
		// TODO Auto-generated method stub
		System.out.println("body colour");
	}

}
