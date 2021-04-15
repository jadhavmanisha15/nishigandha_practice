package practice;

import java.util.Scanner;

public class EvenOdd {

	public static void evenOdd(int x)
	{
		if(x%2==0)
		{
			System.out.println(x+" is even number");
		}
		else {
			System.out.println(x+" is odd number");
		}
	}
	
	
	
	
	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int x=sc.nextInt();
		evenOdd(x);
	}

}
