//Rotate array by k
package array;

import java.util.Arrays;

public class RotateArray 
{
	
	static int a[]= {1,2,3,4,5};
	static int k=3;
	
	
	public static void rotateArray()
	{
		
		for(int j=0;j<k;j++)
		{
			int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
			
		}
		
		a[0]=temp;
		}
		
	}

	public static void main(String[] args) 
	{
		rotateArray();
		
		System.out.println(Arrays.toString(a));
	}

}
