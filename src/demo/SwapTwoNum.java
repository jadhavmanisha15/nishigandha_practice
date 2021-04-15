package demo;

import java.util.Scanner;

public class SwapTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		System.out.println("x = "+x+"  "+"y = "+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x = "+x+"  "+"y = "+y);
		
	}

}
