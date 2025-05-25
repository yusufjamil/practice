package concepts;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("a1");
		hs.add("a2");
		hs.add("a3");
		hs.add("a1");
		hs.add("a4");
		System.out.println(hs);
		
		hs.remove("a2");
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		Iterator<String>it=hs.iterator();
		
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
	}

}
