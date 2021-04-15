package array;

import java.util.Arrays;

public class SortArray {
	public static void method(Object o)
	{
		System.out.println("Object Method");
		
	}
	
	
	  public static void method(String s) 
	  {
		  System.out.println("String Method");
		  
		  }
	 

	public static void main(String[] args) {
		
		SortArray a=new SortArray();
		
		method(null);
		method(a);
		
		int _=10;
		int __=76;
		int e8e=90;
		int $=9;
		//int 5=8;
		int h7=90;
		System.out.println(_);
		
		String[] s= {"Jan","Feb","march","april"};
		
		System.out.println("Unsorted array");
		System.out.println(Arrays.toString(s));
		
		System.out.println("Sorted array");
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		
		System.out.println("Sorted Array by case sensitive");
		Arrays.sort(s, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(s));
		
	}

	
	
}
