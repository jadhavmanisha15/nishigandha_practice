package string;

public class pallindrome {

	public static void main(String[] args)
	{
		int no = 121, remainder;
		int result=0;
		
		while (no!=0) 
		{
			
			int digit = no%10;
			result = result * 10 + digit;
			no/=10;
			
		}
		System.out.println(result);
	}

}
