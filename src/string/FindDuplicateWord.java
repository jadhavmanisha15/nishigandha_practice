package string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateWord {

	public static void main(String[] args) {


		String str="java java c c php ";
		String s=str.toLowerCase();
		String [] s1=s.split(" ");

		
		Map<String, Integer> mp=new HashMap<String, Integer>();
		int cnt=1;

		for(int i=0;i<s1.length;i++)
		{
			cnt=1;
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equalsIgnoreCase(s1[j]))
				{
					cnt=cnt+1;
				}
			}
			if(!mp.containsKey(s1[i]))
			{
				mp.put(s1[i], cnt);
			}

		}


		Iterator itr=mp.entrySet().iterator();

		while(itr.hasNext())
		{
			Entry<String, Integer> en=(Entry<String, Integer>) itr.next();
			System.out.println(en.getKey()+" "+en.getValue());
		}

	}

}
