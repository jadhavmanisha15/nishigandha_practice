package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubString {
	
	public static boolean duplicate(String str)
	{
		int flag=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
				flag++;
				break;
				}
			}
		}
		if(flag==0)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		
		String s="Nishi";
		//Set<String> sub=new HashSet<String>();
		List<String> sub=new ArrayList<String>();
		
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+2;j<=s.length();j++)
			{
				String str=s.substring(i, j);
				boolean flag=duplicate(str);
			
				if(flag==true)
				{
				sub.add(str);
				}
						}
			//break;
		}
		
		System.out.println(sub);
		
		int len=0;
		int temp=0;
		String lonstr = null;
		for (String st : sub) {
			
			len=st.length();
			
			if(len>temp)
			{
				temp=len;
				lonstr=st;
				
			}
			
			
			
		}
		
		System.out.println(lonstr);
	}

}
