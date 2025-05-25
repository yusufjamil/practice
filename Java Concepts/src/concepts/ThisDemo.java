package concepts;

public class ThisDemo 
{
	int a=1;

	public void data()
	{
		int a=2;
		System.out.println(a);
		int b;
		b=a+this.a;
		System.out.println(this.a);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ThisDemo td=new ThisDemo();
		td.data();
	}

}
