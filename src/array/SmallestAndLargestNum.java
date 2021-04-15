package array;

import java.awt.image.SampleModel;
import java.util.Arrays;

public class SmallestAndLargestNum {

	public static void main(String[] args) {
		
		
		
		int a[]= {2,7,-9,45};
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Smallest Number="+a[0]);
		
		System.out.println("Largest Number="+a[a.length-1]);
		
		
		//another way
		int small=0;
		int large=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(small>a[i]) {
				small=a[i];
			}
			else if(large<a[i])
			{
				large=a[i];
				
			}
		}
		
		System.out.println("small="+small);
		System.out.println("large="+large);
		
	}

}
