package demo;

import java.util.Scanner;

public class PrimeNumber {

	
	
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
		if(flag==1)
		{
			System.out.println(x+" is not prime");
		}
		else
		{
			System.out.println(x+" is Prime");
		}
		}
		else
		{
			System.out.println(x+" is not prime");
		}
		
	}
	
	public static void primeNumbers(int x)
	{
		for(int i=2;i<=x;i++)
		{
			primeNum(i);
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int x=sc.nextInt();
		primeNum(x);
		//primeNumbers(x);
		
	}

}
