package array;

public class SumOfTwoEle {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,4,5,6};
		
		int  sum=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				sum=a[i]+a[j];
				if(a[i]<a[j] && sum==6)
				{
					System.out.println(a[i]+"+"+a[j]+"="+sum);
				}
			}
		}
		
	}

}
