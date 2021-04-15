package practice;

public class max {

	public static void main(String[] args) {


		int []a= {10,15,2,3,4,5,50};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
