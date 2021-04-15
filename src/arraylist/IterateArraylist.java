package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArraylist {

	public static void main(String[] args) {


		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("nisha");
		list.add("manisha");
		list.add("deepti");
		list.add("nalu");
		
		//1. using java & with for each loop and lambda expression 
		
		list.forEach(data ->{
			System.out.println(data);
		});
		
		System.out.println("==========");
		
		//2. Using iterator
		
		Iterator<String> it=list.iterator();
		
		while(it.hasNext())
		{
			String str=it.next();
			System.out.println(str);
		}
		
		
		
		System.out.println("=====");
		
		//3. Using iterator and java and forEachRemain() method
		
		Iterator<String> it1=list.iterator();
		it1.forEachRemaining(data ->{
			System.out.println(data);
		});
		
		
		System.out.println("===");
		
		//4 using for each loop
		for (String string : list) {
			
			
			System.out.println(string);
			
		}
		
		
		
		
		System.out.println("====");
		//5 using for loop
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		//6 using a listIterator() to traverse in both directions
		
	}

}
