package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {


		int a[]= {1,2,3,4,5};
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int count=0;
		System.out.println(Arrays.toString(a));

		
		
		for(int j=0;j<a.length;j++)
		{
			int sum =0;
			
			
			
			for(int k=j+1;k<a.length;k++)
			{
				int x=0;
				x=a[j]+a[k];

				if(x==num) 
				{
					count++;
					System.out.print(a[j]+"+"+a[k]+"="+x);
					System.out.println();

				}
				
				
				for(int i=j;i<a.length;i++)
				{
					sum=sum+a[i];

					if(sum==num) 
					{
						count++;
						for(int m=j;m<=i;m++) 
						{
							System.out.print(a[m]+"+");
						}
						System.out.print("="+sum); 
						System.out.println();

					}
					// System.out.print(sum+" ");

				}
			}
			if(count==0)
			{
				System.out.println("summation is not present");
			}
		}

	}
}
