package array;

import java.util.Scanner;

public class FrequencyOfElement {

	public static void main(String[] args) {


		
		int count;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter array length");
		int n=s1.nextInt();
		int a[]=new int[n];
		int fr[]=new int[n];
		System.out.println("Enter element of array");
		for(int i=0;i<n;i++)
		{
			a[i]=s1.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			count=1;
			for(int j=i+1;j<fr.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					fr[j]=-1;
				}
			}
			if(fr[i]!=-1)
			{
				fr[i]=count;
			}
		}
		System.out.println("Element | Frequency");
		for(int i=0;i<a.length;i++)
		{
			if(fr[i]!=-1)
			System.out.println("    "+a[i]+"          "+fr[i]);
		}
		s1.close();

	}

}
