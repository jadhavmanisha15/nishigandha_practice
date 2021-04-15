package array;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class FindDuplicate {

	public static void main(String[] args) {
	
		
		
		
		String []s= {"java","c","php","java","c","java"};
		
		//worst solution
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equalsIgnoreCase(s[j]))
				{
					System.out.println(s[i]);
				}
			}
		}
	
	
	
	
	//using hash set :it store unique
	
	
	Set<String> store=new HashSet<String>();
	
	for(String name:s)
	{
		if(store.add(name)==false)
		{
			System.out.println("Duplicate"+name);
		}
	}
	}

}
