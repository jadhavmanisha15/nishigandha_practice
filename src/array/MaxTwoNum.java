package array;

public class MaxTwoNum {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,4,5,5,6,7};
		
		
		int max1=0;
		int max2=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(max1<a[i])
			{
				max2=max1;
				max1=a[i];
			}
			else if(max2<a[i])
			{
				max2=a[i];
			}
		}
		System.out.println(max1+" "+max2);
	}

}
