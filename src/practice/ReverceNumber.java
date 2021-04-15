package practice;

public class ReverceNumber {

	public static void main(String[] args) {


		int num=1234;
		int rev=0;
		
		while (num !=0)
		{
			int n=num%10;
			rev=rev*10+n;  //4 3 2 1
			num=num/10;
		}
		
		System.out.println("Reverce of number is "+rev);
	}
	

}
