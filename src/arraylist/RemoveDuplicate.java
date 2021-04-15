package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
	
	static int a[]= {1,2,2,3,4,5,1};
	
	public static  void m(ArrayList<Integer> list)
	{
		
		for(int i=0;i<a.length;i++)
		{
			int flag=0;
			for(int j=0;j<list.size();j++)
			{
				if(a[i]==list.get(j))
				{
					 flag = 1;
					 break;
				}
			}
			if(flag==0)
			{
				list.add(a[i]);
			}
		}
	}
	

	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		m(list);
		System.out.println(Arrays.toString(a));
		System.out.println(list);
	}

}
