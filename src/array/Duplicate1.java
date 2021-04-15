package array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicate1 {

	public static void main(String[] args) {


		
		int a[]= {1,1,2,2,1};
		Set<Integer> d=new HashSet<Integer>();
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]==a[j])
			{
				System.out.print(a[i]+" ");
				d.add(a[i]);
				break;
			}
			}
		}
		System.out.println();
		System.out.println(d);
		
	}

}
