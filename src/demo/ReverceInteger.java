package demo;

public class ReverceInteger {

	public static void main(String[] args) {
		
		
		int num=12345;
		int rev=0;
		int x;
		while(num!=0)
		{
			x=num%10;
			rev=rev*10+x;
			num=num/10;
		}
		
		System.out.println(rev);
	}

}
