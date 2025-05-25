package cj;

public class CC1 extends CC2 {
	
int a;

public CC1(int a) 
{
	super(a);
	this.a=a;
}

public int increment() 
{
	a=a+1;
	
	return a;
}

public int decrement() 
{
	a=a-1;
	
	return a;
}

}
