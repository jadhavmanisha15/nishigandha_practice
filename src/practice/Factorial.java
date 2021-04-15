package practice;

import java.util.Scanner;

public class Factorial {


	//factorial of 5*4*3*2*1
	
	public static int factorialOfNum(int x)
	{
		int temp=x;
		for(int i=x-1;i>0;i--)
		{
			temp=temp*i;
		}
		return temp;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int x=sc.nextInt();
		
		int num=factorialOfNum(x);
		System.out.println("Factorial of "+x+" is "+num);
		
		
	}

}
