package practice;

public class Prime {

	public static void main(String[] args) {

		int a=3;
		int mod;
		boolean flag=false;
		for(int i=2;i<=a/2;i++)
		{
			mod=a/i;
			if(mod==0)
			{
				flag=true;
			//	System.out.println("Number is prime");
				break;
			}
			
		}
		if(flag==true)
		{
			System.out.println("Number is  prime");
		}
		else
		{
			System.out.println("number is not prime");
		}
	}

}
