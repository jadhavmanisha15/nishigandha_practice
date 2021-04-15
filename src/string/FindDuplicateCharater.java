package string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateCharater {

	public static void main(String[] args) {


		String str="Nishigandhaa";
		String s=str.toLowerCase();
		System.out.println(s);
		//String [] s1=s.split(" ");

		Map<Character, Integer> mp=new HashMap<Character, Integer>();
		int cnt=1;

		for(int i=0;i<s.length();i++)
		{
			cnt=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					cnt=cnt+1;
				}
			}
			if(!mp.containsKey(s.charAt(i)))
			{
				mp.put(s.charAt(i), cnt);
			}
			
		}


		Iterator itr=mp.entrySet().iterator();

		while(itr.hasNext())
		{
			Entry<Character, Integer> en=(Entry<Character, Integer>) itr.next();
			System.out.println(en.getKey()+" "+en.getValue());
		}

	}

}
