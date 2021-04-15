package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWord {
	
	
	
	public static void duplicate(String str)
	{
		String s[]=str.split(" ");
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		
		for(String word:s)
		{
			if(map.containsKey(word))
			{
				map.put(word.toLowerCase(), map.get(word)+1);
				
			}
			else
			{
				map.put(word, 1);
			}
		}
		
		Set<String> wordInString=map.keySet();
		
		
		for (String word : wordInString) {
			
			if(map.get(word)>1)
			{
				System.out.println(word+":"+map.get(word));
			}
			
		}
	}

	public static void main(String[] args) {


		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		
		duplicate(str);
	}

}
