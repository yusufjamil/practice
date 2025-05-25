package concepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionsIllus 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {4,5,5,5,4,6,6,9,4};
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			a1.add(a[i]);
		}
		
		int count=0;
		for(int j=0;j<a1.size();j++)
		{
			for(int k=j+1;k<a1.size();k++)
			{
				if(a1.get(j)==a1.get(k))
				{
					count++;
				}
				
			}
			if(count==1)
			{
				System.out.println("The number is unique number "+a1.get(j));
			}
		}
	}

}
