package array;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
		
		
		int a[]= {2,3,5,1};
		
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
		
		
		int temp=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=temp)
			{
				System.out.println("Missing number"+temp);
			}
			temp++;
		}
	}

}
