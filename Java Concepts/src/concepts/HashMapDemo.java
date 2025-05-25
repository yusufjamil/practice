package concepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0,"a1");
		hm.put(1, "a2");
		hm.put(2, "a3");
		
		System.out.println(hm.get(0));
		hm.remove(0);
		System.out.println(hm.get(0));
		
		Set es=hm.entrySet();
		
		Iterator it=es.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}

}
