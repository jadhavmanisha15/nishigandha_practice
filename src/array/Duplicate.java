package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



//filter duplicate elements from array and print as list 
// we use set to stored duplicate element because set do not stored duplicate element
//if array contain same element 3 times then if we use list it will add this element two times for that we use "set".

public class Duplicate {

	public static void main(String[] args) {


		Scanner s1=new Scanner(System.in);
		System.out.println("Enter array length");
		int n=s1.nextInt();
		int a[]=new int[n];
		Set<Integer> d1=new HashSet<Integer>();
		List<Integer> d=new ArrayList<Integer>();
		System.out.println("enter array element");
		for(int i=0;i<n;i++)
		{
			a[i]=s1.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]==a[j])
			{
				//System.out.print(a[i]+" ");
				d.add(a[i]);
				break;
			}
			}
		}
		d1.addAll(d);
		System.out.println(d);
		System.out.println(d1);
		s1.close();
	}

}
