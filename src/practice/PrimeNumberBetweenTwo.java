package practice;

public class PrimeNumberBetweenTwo {

	
	
	
	
	public static void primeNum(int x)
	{
		int flag=0;
		int r=0;
		if(x>1)
		{
			
		
		for(int i=2;i<=x/2;i++)
		{
			r=x%i;
			
			if(r==0)
			{
			   flag=1;
			 break;
				
			}
		}
		if(flag!=1)
		{
			System.out.print(x+" ");
		}
		
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int firstnum=20;
		int lastnum=50;
		
		for(int i=firstnum;i<=lastnum;i++)
		{
			primeNum(i);
		}
	}

}
