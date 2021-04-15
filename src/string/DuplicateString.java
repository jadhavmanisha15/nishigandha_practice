package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {


		String str=" Nishigandha sawant Nishigandha Nishigandha Nishigandha";

		String [] a=str.split(" ");


		Map<String, Integer> map=new HashMap<String, Integer>();
		//int count ;

		for (int i = 0; i < a.length; i++)
		{ 
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{

					if(map.containsKey(a[i]))
					{
						map.put(a[i], map.get(a[i])+1);
					}
					
					  else { 
						  map.put(a[i], 1); 
						  }
					 
				}	
			}
		}


		Set<Entry<String,Integer>> s=map.entrySet();

		for (Entry<String, Integer> entry : s) {

			//System.out.println("hghhafdshgf");
			System.out.print(entry.getKey()+" "+entry.getValue());
		}
	}

}
