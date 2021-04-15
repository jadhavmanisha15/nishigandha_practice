package practice;

public class LargestNumber {

	
	
	
	public static void  largestNum(int [] x)
	{
		int temp;
		if(x[0]<x[x.length-1])
		{
			temp=x[x.length-1]; 
			x[x.length-1]=x[0]; 
			x[0]=temp; 
			}
		 
		for(int i=0;i<x.length-1;i++)
		{
			if(x[i]<x[i+1])
			{
				temp=x[i+1];
				x[i+1]=x[i];
				x[i]=temp;
			}
		}
		
		  
		System.out.println("Largest number is "+x[0]);
		
	}
	
	
	
	public static void main(String[] args) {


		int a[]= {1,2,3};
		largestNum(a);
	}

}
