package practice;

public class BinaryToDecimal {
	
	
	public static void binaryToDecimal(int num)
	{
		
		long decimal=0;
		int i=-0;
		while (num!=0) {
			
			long remainder=num%10;
			num=num/10;
			long x=power(i);
			decimal=decimal +remainder*x;
			++i;
		}
		System.out.println(decimal);
	}
		
	
	public static long power(int x)
		{
		int result=1;
		for(int i=0;i<x;i++)
		{
			result=result*2;
		}
				
		return result;
		
	}
	

	public static void main(String[] args) {
		
		
		binaryToDecimal(1111);
		
	}

}
