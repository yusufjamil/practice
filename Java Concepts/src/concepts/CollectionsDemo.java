package concepts;

import java.util.ArrayList;

public class CollectionsDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("a1");
		al.add("a2");
		al.add("a3");
		System.out.println(al);
		
		al.remove(1);
		al.remove("a1");
		System.out.println(al);
		
		//al.removeAll(al);
		//System.out.println(al);
		
		al.get(0);
		System.out.println(al);
		
		System.out.println(al.contains("a"));
		
		System.out.println(al.indexOf("a3"));
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		
		
	}

}
