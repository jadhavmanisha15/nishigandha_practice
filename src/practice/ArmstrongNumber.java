package practice;

public class ArmstrongNumber {

	public static void main(String[] args) {


		//153= 1^3+5^3+3^3=153
		
		int num=153;
		int temp=num;
		int x=0;
		int lastnum=0;
		int result=0;
		while (num!=0) {
			int n=num%10;
			System.out.println(n);
			num=num/10;
			int temp1=1;
			for(int i=0;i<3;i++)
			{
				temp1=temp1*n;
				
			}
			System.out.println(temp1);
			
			result=result+temp1;
		}
		System.out.println(result);
		if(temp==result)
		{
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Number is not a Armstrong");
		}
		
		
	}

}
