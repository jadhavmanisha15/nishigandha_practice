package practice;

public class SecondMax1 {

	public static void main(String[] args) {
		
		
		int a[]= {1,3,44,66,3};
		int Fmax =0;
		int Smax=0;
		
		for(int i=0;i<a.length;i++)
		{
				if(Fmax<a[i])
				{
					Fmax=a[i];
				}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<Fmax)
			{
				if(Smax<a[i])
				{
					Smax=a[i];
				}
			}
		}
		System.out.println("Second max "+Smax);
	}

}
