package practice;

public class PalindromNumber {

	public static void main(String[] args) {


		// 121 rev=121 number is palindrome
		
		int num=121;
		int temp=num;
		int rev=0;
		while (num!=0)
		{
			int n=num%10;
			rev=rev*10+n;
			num=num/10;
			
			
		}
		
		if(temp==rev)
		{
			System.out.println(temp+" is palindrom number");
		}
		else
		{
			System.out.println(temp+" is not a palindrome");
		}
	}

}
