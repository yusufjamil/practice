package SeleniumLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStreamsDemo {
	
	public static void regular() 
	{
		ArrayList<String> names=new ArrayList<>();
		names.add("Abc");
		names.add("Abc1");
		names.add("Abc2");
		names.add("def1");
		names.add("def2");
		
		int count=0;
		
		for(int i=0;i<names.size();i++) 
		{
			String actual=names.get(i);
			if(actual.startsWith("A")) 
			{
				count++;
			}
			
		}
		System.out.println(count);
	}
	
	public static void streamFilter() 
	{
		ArrayList<String> names=new ArrayList<>();
		names.add("Abc1");
		names.add("Abc12");
		names.add("Abc23");
		names.add("def1");
		names.add("def2");
		
		
		//names.stream()-converting names to stream
		//stream-collection of strings
		//a-parameter
		//a.startsWith("A")-condition
		//names.stream()-create stream
		//filter(a->a.startsWith("A"))-Intermediate operation
		//count()-Terminal operation
		long c=names.stream().filter(a->a.startsWith("A")).count();
		System.out.println(c);
		
		//create stream
		long d=Stream.of("Abce","Abc1d","Abc2e","def1e","def2e").filter(a->
		{
			//Terminal operation executes only if intermediate operation returns true
			a.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		
		System.out.println();
		
		//Print all the names of the ArrayList
		names.stream().filter(a->a.length()>4).forEach(a->System.out.println(a));
		names.stream().filter(a->a.length()>4).limit(1).forEach(a->System.out.println(a));
		
		System.out.println();
	}
	
	public static void streamMap() 
	{
		Stream.of("Abe","Abcd","abedd").filter(a->a.endsWith("d")).map(a->a.toUpperCase())
		.forEach(a->System.out.println(a));
		
		System.out.println();
		
		List<String> names1=Arrays.asList("Abe","Abcd","abedd");
		
		Stream.of("Abe","Abcd","Abedd").filter(a->a.startsWith("A")).sorted().map(a->a.toUpperCase())
		.forEach(a->System.out.println(a));
		
		ArrayList<String> names=new ArrayList<String>();
		Stream<String> newStream=Stream.concat(names.stream(), names1.stream());
		
		newStream.sorted().forEach(a->System.out.println(a));
		
		boolean flag=newStream.anyMatch(a->a.equalsIgnoreCase("Abe"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	
	@Test
	public void streamCollect() 
	{
		
		List<String> ls=Stream.of("Abe","Abcde","Abedd").filter(a->a.endsWith("e")).map(a->a.toUpperCase())
		//collect-limits list
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		List<Integer> values=Arrays.asList(3,2,2,7,5,1,9,7);
		values.stream().distinct().forEach(a->System.out.println(a));
		List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}
}
