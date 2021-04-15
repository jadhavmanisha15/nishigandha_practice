package practice;

import java.util.Arrays;

public class Secondmax {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4};
		
		int b[]=new int[a.length];
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					b[i]=a[j];
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println("second lagest number is "+a[1]);
		System.out.println(Arrays.toString(b));
		
	}

}
