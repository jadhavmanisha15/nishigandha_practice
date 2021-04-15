package practice;

public class ArmstrongNumBetweenTwo {
	
	
	
	public static void armstrong(int y) {
		
		int num=y;
		int temp=num;
		int result=0;
		while (num!=0) {
			int n=num%10;
			
			num=num/10;
			int temp1=1;
			for(int i=0;i<3;i++)
			{
				temp1=temp1*n;
				
			}
			
			result=result+temp1;
		}
		
		
		if(temp==result)
		{
			System.out.println(temp+"="+result);
		}
		
		
	}

	public static void main(String[] args) {


		int first=20;
		int last=200;
		
		for(int i=first;i<=last;i++)
		{
			armstrong(i);
		}
	}

}
