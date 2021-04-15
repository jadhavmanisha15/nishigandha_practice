package string;

import java.util.HashMap;
import java.util.Map;

public class NumOfWordInStringUsingHashMap {

	public static void main(String[] args) {
		
		
		String str1="nishi Nishi nalu nali nalu nalu";
		String str=str1.toLowerCase();
		String [] s=str.split(" ");
		
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		for (String st : s) {
			
			if(map.containsKey(st))
			{
				int cnt=map.get(st);
				map.put(st,cnt+1);
			}
			else 
			{
				map.put(st, 1);
			}
		}
		
		System.out.println(map);
	}

}
